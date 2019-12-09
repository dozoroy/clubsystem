package com.club.system.controller;
import com.club.system.bean.*;
import com.club.system.dao.ClubDAO;
import com.club.system.dao.UserClubDAO;
import com.club.system.service.ClubService;
import com.club.system.service.FinaceService;
import com.club.system.service.NewsService;
import com.club.system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
public class ClubController {

    @Autowired
    ClubService clubService;
    @Autowired
    ClubDAO clubDAO;

    @GetMapping("/api/clubs")
    public List<Club> clubslist() throws Exception {
        return clubService.list();
    }

    @GetMapping("/api/clubs/{clubid}")
    public  List<Club> clubList(@PathVariable("clubid")int clubid) throws  Exception{
        if(0 != clubid){
            return  clubService.listByClubid(clubid);
        }else {
            return clubslist();
        }
    }

    @PostMapping("/api/clubs")
    public Club addOrUpdate(@RequestBody Club club) throws Exception {
        clubService.addOrUpdate(club);
        return club;
    }

    @PostMapping("/api/clubs/delete")
    public void delete(@RequestBody Club club) throws Exception {
        clubService.deleteClub(club);
    }

//    @GetMapping("/api/users/{userid}/clubs")
//    public List<Club> listByUserclubs(@PathVariable("userid") int userid) throws Exception {
//        if (0 != userid) {
//            return clubService.listByUserClubs(userid);
//        } else {
//            return clubslist();
//        }
//    }

    @PostMapping("/api/users/{userid}/clubs/{clubid}/delete")
    public void deleteUserClubs(@PathVariable("userid") int userid, @PathVariable("clubid") int clubid) throws Exception {
        clubService.delUserClub(userid, clubid);
    }

    @GetMapping("/api/clubname/")
    public List<Club> findByClubnameContaining( String clubname){
        return clubService.findByClubnameContaining(clubname);
    }


}
