package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.Club;
import com.lyh.ssm.crud.bean.ClubExample;
import com.lyh.ssm.crud.dao.ClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {
    @Autowired
    private  ClubMapper clubMapper;

    public List<Club> list(){
        return clubMapper.selectAll();
    }

    public Club getClubById(int clubid){
        return clubMapper.selectByPrimaryKey(clubid);
    }

    public void  addClub(Club club){
         clubMapper.insert(club);
    }

    public void updateClub(Club club){
        clubMapper.updateByPrimaryKeySelective(club);
    }

    public void  deleteClub(Club club){
        clubMapper.deleteByPrimaryKey(club.getClubid());
    }


    public List<Club> listByClubid(int clubid){
        List<Club> clubs =new ArrayList<Club>();
        clubs.add(clubMapper.selectByPrimaryKey(clubid));
        return  clubs;
    }

    public List<Club> findClub(String clubname){
        ClubExample clubExample =new ClubExample();
        ClubExample.Criteria criteria = clubExample.createCriteria();
        criteria.andClubnameLike("%"+clubname+"%");
        return clubMapper.selectByExampleWithBLOBs(clubExample);
    }
}
