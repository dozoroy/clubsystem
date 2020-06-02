package com.lyh.ssm.crud.controller;

import com.lyh.ssm.crud.bean.Comment;
import com.lyh.ssm.crud.bean.User;
import com.lyh.ssm.crud.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/api/comts")
    public List<Comment> comtslist() throws Exception {
        return commentService.list();
    }

    @PostMapping("/api/comts")
    public Comment addComment(@RequestBody Comment comment) throws  Exception{
        commentService.addComment(comment);
        return  comment;
    }

    @PutMapping("/api/comts")
    public Comment updateComment(@RequestBody Comment comment) throws  Exception{
        commentService.updateComment(comment);
        return  comment;
    }

    @PostMapping("/api/comts/delete")
    public void delete(@RequestBody Comment comment) throws Exception {
        commentService.deleteById(comment.getComid());
    }


    @GetMapping("/api/users/{userid}/comts")
    public List<Comment> listByUserComments(@PathVariable("userid") int userid) throws Exception {
        if (0 != userid) {
            return commentService.listByUserComments(userid) ;
        } else {
            return  comtslist();
        }
    }

    @GetMapping("/api/news/{newsid}/comts")
    public List<Comment> listByNewsComments(@PathVariable("newsid") int newsid) throws Exception {
        if (0 != newsid) {
            return commentService.listByNewsComments(newsid);
        } else {
            return  comtslist();
        }
    }

    @GetMapping("/api/comts/{comid}")
    public  List<Comment> comtList(@PathVariable("comid")int comid) throws  Exception{
        if(0 != comid){
            return  commentService.listByComid(comid);
        }else {
            return comtslist();
        }
    }

    @GetMapping("/api/content/")
    public  List<Comment> findByUserAndContent(User user, String content){
        return commentService.findByUserAndContent(user,content);
    }

    @PostMapping("/api/users/{userid}/news/{newsid}/delete")
    public void deleteUserNews(@PathVariable("userid") int userid, @PathVariable("newsid") int newsid) throws Exception {
        commentService.delUserNews(userid,newsid);
    }

}
