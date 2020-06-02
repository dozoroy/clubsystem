package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.Finace;
import com.lyh.ssm.crud.bean.FinaceExample;
import com.lyh.ssm.crud.dao.FinaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinaceService {

    @Autowired
    private FinaceMapper finaceMapper;

    public List<Finace> list(){

        return  finaceMapper.selectAll();
    }

    public  void  addFinace(Finace finace){
        finaceMapper.insert(finace);
    }

    public void updateFinace(Finace finace){
        finaceMapper.updateByPrimaryKeySelective(finace);
    }

    public void   deleteById(int finaid){
        finaceMapper.deleteByPrimaryKey(finaid);
    }

    public List<Finace> listByClubFinaces(int clubid){
        FinaceExample finaceExample = new FinaceExample();
        FinaceExample.Criteria criteria = finaceExample.createCriteria();
        criteria.andClubidEqualTo(clubid);
        return  finaceMapper.selectByExample(finaceExample);
    }

    public  List<Finace> findbyFinaname(String finaname){
        FinaceExample finaceExample = new FinaceExample();
        FinaceExample.Criteria criteria = finaceExample.createCriteria();
        criteria.andFinanameLike("%"+finaname+"%");
        return  finaceMapper.selectByExample(finaceExample);
    }

    public  List<Finace> listByFinaid(int finaid){
        List<Finace> finaces =new ArrayList<Finace>();
        finaces.add(finaceMapper.selectByPrimaryKey(finaid));
        return  finaces;
    }
}
