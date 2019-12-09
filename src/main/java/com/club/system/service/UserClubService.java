package com.club.system.service;


import com.club.system.bean.Club;
import com.club.system.bean.User;
import com.club.system.bean.UserClub;
import com.club.system.dao.ClubDAO;
import com.club.system.dao.UserClubDAO;
import com.club.system.dao.UserEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClubService {
    @Autowired
    UserClubDAO userClubDAO;
    @Autowired
    ClubService clubService;
    @Autowired
    UserService userService;

    public  List<UserClub> list(){
        Sort sort =Sort.by(Sort.Direction.DESC,"id");
        return  userClubDAO.findAll(sort);
    }

    public void addOrUpdate(UserClub userClub){
        userClubDAO.save(userClub);
    }

    public UserClub get(int id){
        UserClub  uc=userClubDAO.findById(id).orElse(null);
        return  uc;
    }

    public  List<UserClub> listByClubUserClubs(int clubid){
        Club club =clubService.get(clubid);
        Sort sort =Sort.by(Sort.Direction.DESC,"id");
        return  userClubDAO.findAllByClub(club);
    }

    public List<UserClub> listByUserUserClubs(int userid){
        User user = userService.get(userid);
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return   userClubDAO.findAllByUser(user);
    }

    public void   deleteById(int id){
        userClubDAO.deleteById(id);
    }

}
