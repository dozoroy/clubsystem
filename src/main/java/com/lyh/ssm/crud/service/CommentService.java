package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.Comment;
import com.lyh.ssm.crud.bean.CommentExample;
import com.lyh.ssm.crud.bean.User;
import com.lyh.ssm.crud.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> list(){
        return  commentMapper.selectAll();
    }

    public void addComment(Comment comment){
        commentMapper.insert(comment);
    }

    public void updateComment(Comment comment){
        commentMapper.updateByPrimaryKeySelective(comment);
    }

    public List<Comment> listByUserComments(int userid){
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        return  commentMapper.selectByExample(commentExample);
    }

    public List<Comment> listByNewsComments(int newsid){
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andNewsidEqualTo(newsid);
        return  commentMapper.selectByExample(commentExample);
    }

    public void   deleteById(int comid){
        commentMapper.deleteByPrimaryKey(comid);
    }

    public List<Comment> listByComid(int comid){
        List<Comment> comments = new ArrayList<Comment>();
        comments.add(commentMapper.selectByPrimaryKey(comid));
        return  comments;
    }

    public void delUserNews(int userid,int newsid){
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andNewsidEqualTo(newsid);
        criteria.andUseridEqualTo(userid);
        commentMapper.deleteByExample(commentExample);
    }

    public List<Comment> findByUserAndContent(User user, String content){
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria =  commentExample.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());
        criteria.andContentLike("%"+content+"%");
        return  commentMapper.selectByExample(commentExample);
    }


}
