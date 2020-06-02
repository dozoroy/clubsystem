package com.lyh.ssm.crud.controller;


import com.lyh.ssm.crud.bean.Club;
import com.lyh.ssm.crud.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ClubController {
    @Autowired
    private ClubService clubService;

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
    public Club addClub(@RequestBody Club club) throws Exception {
        clubService.addClub(club);
        return club;
    }

    @PutMapping("/api/clubs")
    public Club updateClub(@RequestBody Club club) throws  Exception{
        clubService.updateClub(club);
        return  club;
    }

    @PostMapping("/api/clubs/delete")
    public void delete(@RequestBody Club club) throws Exception {
        clubService.deleteClub(club);
    }



    @GetMapping("/api/clubname/")
    public List<Club> findClubname( String clubname){
        return clubService.findClub(clubname);
    }
}
