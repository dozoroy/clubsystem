package com.club.system.service;

import com.club.system.bean.Comment;
import com.club.system.bean.News;
import com.club.system.bean.User;
import com.club.system.dao.ComtDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComtService
{
    @Autowired
    ComtDAO comtDAO;
    @Autowired
    UserService userService;
    @Autowired
    NewsService newsService;


    public List<Comment> list(){
        Sort sort =  Sort.by(Sort.Direction.DESC,"comid");
        return  comtDAO.findAll(sort);
    }

    public List<Comment> listByUserComments(int userid){
        User user = userService.get(userid);
        Sort sort = Sort.by(Sort.Direction.DESC,"comid");
        return  comtDAO.findAllByUser(user);
    }

    public List<Comment> listByNewsComments(int newsid){
        News news = newsService.get(newsid);
        Sort sort = Sort.by(Sort.Direction.DESC,"comid");
        return  comtDAO.findAllByNews(news);
    }

    public void   deleteById(int comid){
        comtDAO.deleteById(comid);
    }

    public List<Comment> listByComid(int comid){
        return  comtDAO.findByComid(comid);
    }

    public void delUserNews(int userid,int newsid){  comtDAO.delUserNews(userid,newsid);}

}
