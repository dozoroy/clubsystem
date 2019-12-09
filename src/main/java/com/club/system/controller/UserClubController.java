package com.club.system.controller;
import com.club.system.bean.Club;
import com.club.system.bean.User;
import com.club.system.bean.UserClub;
import com.club.system.service.ClubService;
import com.club.system.service.UserClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserClubController {

    @Autowired
    UserClubService userClubService;

    @GetMapping("/api/userclubs")
    public  List<UserClub> userclubslist() throws  Exception{
        return  userClubService.list();
    }

    @PostMapping("/api/userclubs")
    public UserClub addOrUpdate(@RequestBody UserClub userClub) throws Exception {
        userClubService.addOrUpdate(userClub);
        return userClub;
    }


    @PostMapping("/api/userclubs/delete")
    public void delete(@RequestBody UserClub userClub) throws Exception {
        userClubService.deleteById(userClub.getId());
    }


    @GetMapping("/api/{clubid}/rolestate")
    public  List<UserClub> listByUserClubRoles(@PathVariable("clubid")int clubid) throws Exception {
        if(0!=clubid){
            return  userClubService.listByClubUserClubs(clubid);
        }else{
            return  userclubslist();
        }
     }

    @GetMapping("/api/{userid}/myrolestate")
    public List<UserClub>  listByUserClubmyRoles(@PathVariable("userid")int userid) throws Exception{
        if(0!=userid){
            return  userClubService.listByUserUserClubs(userid);
        }else {
            return userclubslist();
        }
    }

}
