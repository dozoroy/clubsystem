package com.club.system.service;

import com.club.system.bean.Club;
import com.club.system.bean.User;
import com.club.system.dao.ClubDAO;
import com.club.system.dao.UserClubDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    ClubDAO clubDAO;
    @Autowired
    UserClubDAO userClubDAO;
    @Autowired
    UserService userService;

    public List<Club>list(){
        Sort sort = Sort.by(Sort.Direction.DESC, "clubid");
        return  clubDAO.findAll(sort);
    }

    public Club get(int clubid){
        Club  c=clubDAO.findById(clubid).orElse(null);
        return  c;
    }

    public void addOrUpdate(Club club) {
        clubDAO.save(club);
    }

    public void deleteById(int clubid) {
        clubDAO.deleteById(clubid);
    }

    public void delUserClub(int userid,int clubid){  userClubDAO.delUserClub(userid,clubid);}

    public void deleteClub(Club club) {
        // TODO Auto-generated method stub
        userClubDAO.deleteByClub(club);
        clubDAO.deleteById(club.getClubid());
    }


    public  List<Club> listByClubid(int clubid){
        return  clubDAO.findByClubid(clubid);
    }

    public  List<Club>findByClubnameContaining(String clubname){
       Sort sort = Sort.by(Sort.Direction.DESC, "clubid");
        return   clubDAO.findByClubnameContaining(clubname);
    }


}
