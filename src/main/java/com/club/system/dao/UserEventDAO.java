package com.club.system.dao;

import com.club.system.bean.Event;
import com.club.system.bean.User;
import com.club.system.bean.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserEventDAO extends JpaRepository<UserEvent,Integer>{

    List<UserEvent> findAllByEvent(Event event);

    List<UserEvent> findAllByUser(User user);


    @Transactional
    public void deleteByEvent(Event event);


    @Transactional
    @Modifying
    @Query(name = "delUserEvent",value = "delete from joinevent where userid=?1 and eventid=?2",nativeQuery = true)
    int delUserEvent(int userid,int eventid);


}
