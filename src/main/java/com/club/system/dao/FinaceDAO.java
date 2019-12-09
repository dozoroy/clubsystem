package com.club.system.dao;

import com.club.system.bean.Club;
import com.club.system.bean.Finace;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinaceDAO extends JpaRepository<Finace,Integer>{
    List<Finace> findALLByClub(Club club);

    List<Finace> findByFinanameContaining(String finaname);

    List<Finace> findByFinaid(int finaid);
}

