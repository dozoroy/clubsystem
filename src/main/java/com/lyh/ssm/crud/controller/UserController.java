package com.lyh.ssm.crud.controller;

import com.lyh.ssm.crud.bean.News;
import  com.lyh.ssm.crud.bean.User;
import  com.lyh.ssm.crud.model.Result;
import  com.lyh.ssm.crud.service.UserService;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.*;
import  org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        List<User> userList =userService.login(username,requestUser.getPassword(),requestUser.getType());
        if(userList.size()<=0){
            return  new Result(400);
        }
        else {
            return  new Result(200);
        }
    }

    @GetMapping("/api/users/{userid}")
    public  List<User> user(@PathVariable("userid")int userid) throws  Exception {
            List<User> users = new ArrayList<User>();
            users.add(userService.getUserById(userid));
            return users;
    }

    @GetMapping("/api/users")
    public List<User> userList() throws Exception{
        return  userService.getAllUser();
    }



    @DeleteMapping("/api/users/delete")
    public void deleteUserById(@RequestBody User user ){
       userService.deleteUserById(user.getUserid());
    }

    @PostMapping("/api/users")
    public  User addUser(@RequestBody User user){
        userService.addUser(user);
        return  user;
    }

    @PutMapping("/api/users")
    public User updateUser(@RequestBody User user){
      userService.updateUser(user);
      return  user;
    }

    @GetMapping("/api/username/")
    @ResponseBody
    public  List<User> findUser(@RequestParam(value = "username") String username) throws  Exception{
      return   userService.findUser(username);
    }
}
