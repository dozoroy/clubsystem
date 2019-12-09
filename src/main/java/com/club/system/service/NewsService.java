package com.club.system.service;

import com.club.system.bean.Event;
import com.club.system.dao.ComtDAO;
import com.club.system.dao.NewsDAO;
import com.club.system.bean.News;
import com.club.system.bean.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsDAO newsDAO;
    @Autowired
    ClubService clubService;
    @Autowired
    ComtDAO comtDAO;

    public List<News> list(){
        Sort sort =  Sort.by(Sort.Direction.DESC,"newsid");
        return  newsDAO.findAll(sort);
    }
    public  void  addOrUpdate(News news){
        newsDAO.save(news);

    }

    public void   deleteById(int newsid){
        newsDAO.deleteById(newsid);
    }

    public List<News> listByClubNews(int clubid){
        Club club = clubService.get(clubid);
        Sort sort = Sort.by(Sort.Direction.DESC,"newsid");
        return  newsDAO.findALLByClub(club);
    }
   public List<News> findAllByNewsnameLike(String keyword1){
    return  newsDAO.findAllByNewsnameLike(keyword1);
   }

    public News get(int newsid){
        News  n=newsDAO.findById(newsid).orElse(null);
        return  n;
    }

    public List<News> findByNewsnameContaining(String newsname){
        Sort sort = Sort.by(Sort.Direction.DESC,"newid");
        return  newsDAO.findByNewsnameContaining(newsname);
    }

    public List<News> listByNewsid(int newsid){
        return  newsDAO.findByNewsid(newsid);
    }

    public  void deleteNews(News news){
        comtDAO.deleteByNews(news);
        newsDAO.deleteById(news.getNewsid());

    }


}
