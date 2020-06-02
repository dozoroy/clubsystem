package com.lyh.ssm.crud.controller;

import com.lyh.ssm.crud.bean.News;
import com.lyh.ssm.crud.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class NewsController {

    @Autowired
   private NewsService newsService;

    @GetMapping("/api/newsname/")
    public List<News> findByNewsname(String newsname) throws  Exception{
        return  newsService.findByNewsname(newsname);
    }

    @GetMapping("/api/news")
    public List<News> newslist() throws Exception {
        return newsService.list();
    }

    @GetMapping("/api/users/{userid}/news")
    public  List<News> newslists(@PathVariable("userid")int userid) throws Exception{
        return newsService.findNewsByUser(userid);
    }

    @PostMapping("/api/news")
    public News addNews(@RequestBody News news) throws  Exception{
        newsService.addNews(news);
        return news;
    }

    @PutMapping("/api/news")
   public News updateNews(@RequestBody News news) throws Exception {
        newsService.updateNews(news);
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
