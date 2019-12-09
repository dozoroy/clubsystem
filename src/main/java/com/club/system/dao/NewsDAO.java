package com.club.system.dao;

import com.club.system.bean.Club;
import com.club.system.bean.News;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NewsDAO extends JpaRepository<News,Integer>{
    List<News> findALLByClub(Club club);

    /*精确查询*/
    List<News> findAllByNewsnameLike(String keyword1);

    /*模糊查询*/
    List<News> findByNewsnameContaining(String newsname);

    List<News> findByNewsid(int newsid);
}

