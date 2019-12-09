package com.club.system.dao;

import com.club.system.bean.Club;
import com.club.system.bean.User;
import com.club.system.bean.UserClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserClubDAO extends JpaRepository<UserClub,Integer> {

    @Transactional
    public void deleteByClub(Club club);

    @Transactional
    @Modifying
    @Query(name = "delUserClub",value = "delete from joinclub where userid=?1 and clubid=?2",nativeQuery = true)
    int delUserClub(int userid,int clubid);

//   @Transactional
//   @Query("select userid from UserClub  userClub where clubid=?1",nativeQuery = true)
//   List<UserClub> findALLByClubid(Club clubid);


    List<UserClub> findAllByClub(Club club);

    List<UserClub> findAllByUser(User user);
}
