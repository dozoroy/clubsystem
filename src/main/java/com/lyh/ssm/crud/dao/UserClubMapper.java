package com.lyh.ssm.crud.dao;


import com.lyh.ssm.crud.bean.UserClub;
import com.lyh.ssm.crud.bean.UserClubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClubMapper {
    long countByExample(UserClubExample example);

    int deleteByExample(UserClubExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserClub record);

    int insertSelective(UserClub record);

    List<UserClub> selectByExample(UserClubExample example);

    UserClub selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserClub record, @Param("example") UserClubExample example);

    int updateByExample(@Param("record") UserClub record, @Param("example") UserClubExample example);

    int updateByPrimaryKeySelective(UserClub record);

    int updateByPrimaryKey(UserClub record);

    List<UserClub> selectAll();
}
