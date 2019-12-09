package com.club.system.controller;

import com.club.system.bean.News;
import com.club.system.dao.NewsDAO;
import com.club.system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class NewsController {

    @Autowired
    NewsService newsService;
    @Autowired
    NewsDAO newsDAO;


    @GetMapping("/api/newsname/")
    public List<News> findByNewsnameContaining(String newsname) throws  Exception{
        return  newsService.findByNewsnameContaining(newsname);
    }

    @GetMapping("/api/news")
    public List<News> newslist() throws Exception {
        return newsService.list();
    }

    @PostMapping("/api/news")
    public News addOrUpdate(@RequestBody News news) throws Exception {
        newsService.addOrUpdate(news);
        return news;
    }

    @PostMapping("/api/news/delete")
    public void delete(@RequestBody News news) throws Exception {
        newsService.deleteNews(news);
    }


    @GetMapping("/api/clubs/{clubid}/news")
    public List<News> listByClubNews(@PathVariable("clubid") int clubid) throws Exception {
        if (0 != clubid) {
            return newsService.listByClubNews(clubid);
        } else {
            return newslist();
        }
    }


    @GetMapping("/api/news/{newsid}")
    public  List<News> newsList(@PathVariable("newsid")int newsid) throws  Exception{
        if(0 != newsid){
            return  newsService.listByNewsid(newsid);
        }else {
            return newslist();
        }
    }

}
