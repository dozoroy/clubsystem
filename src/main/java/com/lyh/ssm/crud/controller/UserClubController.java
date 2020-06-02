package com.lyh.ssm.crud.controller;



import com.lyh.ssm.crud.bean.UserClub;
import com.lyh.ssm.crud.service.UserClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserClubController {
    @Autowired
   private UserClubService userClubService;

    @GetMapping("/api/userclubs")
    public List<UserClub> userclubslist() throws  Exception{
        return  userClubService.list();
    }

    @PostMapping("/api/userclubs")
    public UserClub addUserClub(@RequestBody UserClub userClub) throws Exception{
        userClubService.addUserClub(userClub);
        return userClub;
    }

    @PutMapping("/api/userclubs")
    public UserClub updateUserClub(@RequestBody UserClub userClub) throws Exception {
        userClubService.UpdateUserClub(userClub);
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

        @PostMapping("/api/users/{userid}/clubs/{clubid}/delete")
    public void deleteUserClubs(@PathVariable("userid") int userid, @PathVariable("clubid") int clubid) throws Exception {
        userClubService.delUserClub(userid, clubid);
    }


}
