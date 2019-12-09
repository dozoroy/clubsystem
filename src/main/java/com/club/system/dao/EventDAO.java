package com.club.system.dao;

import com.club.system.bean.Club;
import com.club.system.bean.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventDAO extends JpaRepository<Event,Integer>{

     List<Event> findALLByClub(Club club);

     List<Event> findByEventnameContaining(String eventname);

     List<Event> findByEventid(int eventid);
}

