package com.lyh.ssm.crud.dao;

import com.lyh.ssm.crud.bean.UserEvent;
import com.lyh.ssm.crud.bean.UserEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEventMapper {
    long countByExample(UserEventExample example);

    int deleteByExample(UserEventExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserEvent record);

    int insertSelective(UserEvent record);

    List<UserEvent> selectByExample(UserEventExample example);

    UserEvent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserEvent record, @Param("example") UserEventExample example);

    int updateByExample(@Param("record") UserEvent record, @Param("example") UserEventExample example);

    int updateByPrimaryKeySelective(UserEvent record);

    int updateByPrimaryKey(UserEvent record);

    List<UserEvent> selectAll();
}
