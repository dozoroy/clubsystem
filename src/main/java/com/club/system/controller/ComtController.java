package com.club.system.controller;

import com.club.system.bean.Comment;
import com.club.system.service.ComtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ComtController {

    @Autowired
    ComtService comtService;


    @GetMapping("/api/comts")
    public List<Comment> comtslist() throws Exception {
        return comtService.list();
    }

    @PostMapping("/api/comts/delete")
    public void delete(@RequestBody Comment comment) throws Exception {
        comtService.deleteById(comment.getComid());
    }


    @GetMapping("/api/users/{userid}/comts")
    public List<Comment> listByUserComments(@PathVariable("userid") int userid) throws Exception {
        if (0 != userid) {
            return comtService.listByUserComments(userid) ;
        } else {
            return  comtslist();
        }
    }

    @GetMapping("/api/news/{newsid}/comts")
    public List<Comment> listByNewsComments(@PathVariable("newsid") int newsid) throws Exception {
        if (0 != newsid) {
            return comtService.listByNewsComments(newsid);
        } else {
            return  comtslist();
        }
    }

    @GetMapping("/api/comts/{comid}")
    public  List<Comment> comtList(@PathVariable("comid")int comid) throws  Exception{
        if(0 != comid){
            return  comtService.listByComid(comid);
        }else {
            return comtslist();
        }
    }

    @PostMapping("/api/users/{userid}/news/{newsid}/delete")
    public void deleteUserNews(@PathVariable("userid") int userid, @PathVariable("newsid") int newsid) throws Exception {
        comtService.delUserNews(userid,newsid);
    }


}
