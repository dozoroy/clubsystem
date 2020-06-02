package com.lyh.ssm.crud.dao;

import com.lyh.ssm.crud.bean.Club;
import com.lyh.ssm.crud.bean.ClubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClubMapper {
    long countByExample(ClubExample example);

    int deleteByExample(ClubExample example);

    int deleteByPrimaryKey(Integer clubid);

    int insert(Club record);

    int insertSelective(Club record);

    List<Club> selectByExampleWithBLOBs(ClubExample example);

    List<Club> selectByExample(ClubExample example);

    Club selectByPrimaryKey(Integer clubid);

    int updateByExampleSelective(@Param("record") Club record, @Param("example") ClubExample example);

    int updateByExampleWithBLOBs(@Param("record") Club record, @Param("example") ClubExample example);

    int updateByExample(@Param("record") Club record, @Param("example") ClubExample example);

    int updateByPrimaryKeySelective(Club record);

    int updateByPrimaryKeyWithBLOBs(Club record);

    int updateByPrimaryKey(Club record);

    List<Club> selectAll();
}
