package com.lyh.ssm.crud.dao;

import com.lyh.ssm.crud.bean.Finace;
import com.lyh.ssm.crud.bean.FinaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceMapper {
    long countByExample(FinaceExample example);

    int deleteByExample(FinaceExample example);

    int deleteByPrimaryKey(Integer finaid);

    int insert(Finace record);

    int insertSelective(Finace record);

    List<Finace> selectByExample(FinaceExample example);

    Finace selectByPrimaryKey(Integer finaid);

    int updateByExampleSelective(@Param("record") Finace record, @Param("example") FinaceExample example);

    int updateByExample(@Param("record") Finace record, @Param("example") FinaceExample example);

    int updateByPrimaryKeySelective(Finace record);

    int updateByPrimaryKey(Finace record);

    List<Finace> selectAll();
}
