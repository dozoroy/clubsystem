package com.lyh.ssm.crud.service;
import com.lyh.ssm.crud.bean.User;
import com.lyh.ssm.crud.bean.UserExample;
import com.lyh.ssm.crud.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public  User getUserById(Integer userid){
        return userMapper.selectByPrimaryKey(userid);
    }

    public  List<User> login(String username,String password,String type){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        criteria.andTypeEqualTo(type);
        return  userMapper.selectByExample(userExample);
    }

    public List<User> getAllUser(){
        return userMapper.selectAll();
    }

    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    public Integer deleteUserById(Integer userid){
        return userMapper.deleteByPrimaryKey(userid);
    }

    public Integer updateUser(User user){
        return  userMapper.updateByPrimaryKeySelective(user);
    }

    public List<User> findUser(String username){
        UserExample userExample= new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameLike("%"+username+"%");
        return  userMapper.selectByExampleWithBLOBs(userExample);
    }
}
