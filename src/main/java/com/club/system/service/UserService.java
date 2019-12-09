package com.club.system.service;
import com.club.system.bean.Club;
import com.club.system.bean.Event;
import com.club.system.bean.User;
import com.club.system.bean.UserClub;
import com.club.system.dao.ClubDAO;
import com.club.system.dao.UserClubDAO;
import com.club.system.dao.UserDAO;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    @Autowired
    ClubService clubService;
    @Autowired
    EventService eventService;
    @Autowired
    UserClubService userClubService;
    @Autowired
    UserClubDAO  userClubDAO;

    public boolean isExist(int userid) {
        User user = getByUserid(userid);
        return null != user;
    }


    public User getByUserid(int userid) {
        return userDAO.findByUserid(userid);
    }

    public User get(String username, String password,String type){
        return userDAO.getByUsernameAndPasswordAndType(username, password,type);
    }


    public List<User> list(){
        Sort sort =  Sort.by(Sort.Direction.DESC,"userid");
        return  userDAO.findAll(sort);
    }
    public  void addOrUpdate(User user){
        userDAO.save(user);
    }

    public void   deleteById(int userid){
        userDAO.deleteById(userid);
    }

    public User get(int userid){
        User  u=userDAO.findById(userid).orElse(null);
        return  u;
    }





    public List<User> findByUsernameContaining(String username){
        Sort sort=Sort.by(Sort.Direction.DESC,"usrid");
        return  userDAO.findAllByUsernameContaining(username);

    }


    public List<User> listByUserid(int userid){
        return userDAO.findAllByUserid(userid);
    }


}

