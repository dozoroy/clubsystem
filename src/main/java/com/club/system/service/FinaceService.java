package com.club.system.service;

import com.club.system.dao.FinaceDAO;
import com.club.system.bean.Finace;
import com.club.system.bean.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinaceService {
    @Autowired
    FinaceDAO finaceDAO;
    @Autowired
    ClubService clubService;

    public List<Finace> list(){
        Sort sort =  Sort.by(Sort.Direction.DESC,"finaid");
        return  finaceDAO.findAll(sort);
    }

    public  void  addOrUpdate(Finace finace){
        finaceDAO.save(finace);
    }

    public void   deleteById(int finaid){
        finaceDAO.deleteById(finaid);
    }

    public List<Finace> listByClubFinaces(int clubid){
        Club club = clubService.get(clubid);
        Sort sort = Sort.by(Sort.Direction.DESC,"finaid");
        return  finaceDAO.findALLByClub(club);
    }

    public  List<Finace> findbyFinanameContaining(String finaname){
        Sort sort = Sort.by(Sort.Direction.DESC,"finaid");
        return finaceDAO.findByFinanameContaining(finaname);
    }

    public  List<Finace> listByFinaid(int finaid){
        return  finaceDAO.findByFinaid(finaid);
    }

}
