package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.*;
import com.lyh.ssm.crud.dao.ClubMapper;
import com.lyh.ssm.crud.dao.CommentMapper;
import com.lyh.ssm.crud.dao.NewsMapper;
import com.lyh.ssm.crud.dao.UserClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private CommentMapper commentMapper;


    public List<News> list(){
        return  newsMapper.selectAll();
    }

    public  void  addNews(News news){
        newsMapper.insert(news);
    }

    public void updateNews(News news){
        newsMapper.updateByPrimaryKeySelective(news);

    }

    public void   deleteById(int newsid){
        newsMapper.deleteByPrimaryKey(newsid);
    }

    public List<News> listByClubNews(int clubid){
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andClubidEqualTo(clubid);
        return  newsMapper.selectByExample(newsExample);
    }


    public News get(int newsid){
        News  n=newsMapper.selectByPrimaryKey(newsid);
        return  n;
    }

    public List<News> findByNewsname(String newsname){
        NewsExample newsExample =new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andNewsnameLike("%"+newsname+"%");
        return  newsMapper.selectByExample(newsExample);
    }

    public List<News> listByNewsid(int newsid){
        List<News> news = new ArrayList<News>();
        news.add(newsMapper.selectByPrimaryKey(newsid));
        return  news;

    }

    public  void deleteNews(News news){
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andNewsidEqualTo(news.getNewsid());
        commentMapper.deleteByExample(commentExample);
        newsMapper.deleteByPrimaryKey(news.getNewsid());
    }

    public List<News> findNewsByUser(int userid){
        return    newsMapper.selectNewsByUser(userid);
    }

}
