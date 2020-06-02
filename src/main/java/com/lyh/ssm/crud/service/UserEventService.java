package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.UserEvent;
import com.lyh.ssm.crud.bean.UserEventExample;
import com.lyh.ssm.crud.dao.UserEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserEventService {

    @Autowired
    private UserEventMapper userEventMapper;

    public void addUserEvent(UserEvent userEvent){
        userEventMapper.insert(userEvent);
    }

   public void updateUserEvent(UserEvent userEvent){
        userEventMapper.updateByPrimaryKeySelective(userEvent);
    }

    public List<UserEvent> list(){
        return  userEventMapper.selectAll();
    }

    public  UserEvent get(int id){
        UserEvent ue=userEventMapper.selectByPrimaryKey(id);
        return  ue;
    }

    public List<UserEvent> listByUserUserEvents(int userid){
        UserEventExample userEventExample = new UserEventExample();
        UserEventExample.Criteria criteria= userEventExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        return   userEventMapper.selectByExample(userEventExample);
    }

    public List<UserEvent> listByEventUserEvents(int eventid){
        UserEventExample userEventExample = new UserEventExample();
        UserEventExample.Criteria criteria= userEventExample.createCriteria();
        criteria.andEventidEqualTo(eventid);
        return   userEventMapper.selectByExample(userEventExample);
    }

    public void   deleteById(int id){
        userEventMapper.deleteByPrimaryKey(id);
    }
}
