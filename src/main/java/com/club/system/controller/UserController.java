package com.club.system.controller;

import com.club.system.bean.Club;
import com.club.system.bean.User;
import com.club.system.dao.UserDAO;
import com.club.system.result.Result;
import com.club.system.service.ClubService;
import com.club.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService  userService;
    @Autowired
    UserDAO userDAO;

    @GetMapping("/api/users")
    public List<User> userlist() throws  Exception{
        return  userService.list();
    }

    @PostMapping("/api/users")
    public User addOrUpdate(@RequestBody User user) throws  Exception{

        userService.addOrUpdate(user);
        return  user;
    }

    @PostMapping("/api/users/delete")
    public void delete(@RequestBody User user) throws  Exception{

        userService.deleteById(user.getUserid());
    }

//    @GetMapping("/api/clubs/{clubid}/users")
//    public List<User> listByClubUsers(@PathVariable("clubid")int clubid) throws Exception{
//        if(0!=clubid){
//            return  userService.listByClubUsers(clubid);
//        }else{
//            return  userlist();
//        }
//    }
//
//    @GetMapping("/api/events/{eventid}/users")
//    public List<User> listByEventUsers(@PathVariable("eventid")int eventid) throws Exception{
//        if(0!=eventid){
//            return  userService.listByEventUsers(eventid);
//        }else{
//            return  userlist();
//        }
//    }

    @GetMapping("/api/username/")
    public  List<User> findByUsernameContaining(String username)throws  Exception{
        return userService.findByUsernameContaining(username);
    }


    @GetMapping("/api/users/{userid}")
    public  List<User> userList(@PathVariable("userid")int userid) throws  Exception{
        if(0 != userid){
            return  userService.listByUserid(userid);
        }else {
            return userlist();
        }
    }


}


