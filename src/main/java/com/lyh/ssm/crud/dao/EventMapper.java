package com.lyh.ssm.crud.dao;

import com.lyh.ssm.crud.bean.Event;
import com.lyh.ssm.crud.bean.EventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper {
    long countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(Integer eventid);

    int insert(Event record);

    int insertSelective(Event record);

    List<Event> selectByExampleWithBLOBs(EventExample example);

    List<Event> selectByExample(EventExample example);

    Event selectByPrimaryKey(Integer eventid);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKeyWithBLOBs(Event record);

    int updateByPrimaryKey(Event record);

    List<Event> selectAll();

    List<Event> selectEventByUser(int userid);
}
