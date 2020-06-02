package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.UserClub;
import com.lyh.ssm.crud.bean.UserClubExample;
import com.lyh.ssm.crud.bean.UserExample;
import com.lyh.ssm.crud.dao.UserClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClubService {
    @Autowired
    private UserClubMapper userClubMapper;

    public List<UserClub> list(){
        return  userClubMapper.selectAll();
    }

    public void addUserClub(UserClub userClub){
        userClubMapper.insert(userClub);
    }


    public void UpdateUserClub(UserClub userClub){
        userClubMapper.updateByPrimaryKeySelective(userClub);
    }

    public UserClub get(int id){
        UserClub  uc=userClubMapper.selectByPrimaryKey(id);
        return  uc;
    }

    public  List<UserClub> listByClubUserClubs(int clubid){
        UserClubExample userClubExample =new UserClubExample();
        UserClubExample.Criteria criteria = userClubExample.createCriteria();
        criteria.andClubidEqualTo(clubid);
        return  userClubMapper.selectByExample(userClubExample);
    }

    public List<UserClub> listByUserUserClubs(int userid){
        UserClubExample userClubExample =new UserClubExample();
        UserClubExample.Criteria criteria = userClubExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        return  userClubMapper.selectByExample(userClubExample);
    }

    public void   deleteById(int id){
        userClubMapper.deleteByPrimaryKey(id);
    }

    public  void  delUserClub(int userid,int clubid){
        UserClubExample userClubExample =new UserClubExample();
        UserClubExample.Criteria criteria = userClubExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andClubidEqualTo(clubid);
        userClubMapper.deleteByExample(userClubExample);
    }
}
