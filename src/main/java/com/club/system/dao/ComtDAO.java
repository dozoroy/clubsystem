package com.club.system.dao;

import com.club.system.bean.Comment;
import com.club.system.bean.News;
import com.club.system.bean.User;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface ComtDAO extends JpaRepository<Comment,Integer>{

    List<Comment> findAllByUser(User user);

    List<Comment> findAllByNews(News news);

    List<Comment> findByComid(int comid);

    @Transactional
    public void deleteByNews(News news);

    @Transactional
    public void deleteByUser(User user);



    @Transactional
    @Modifying
    @Query(name = "delUserNews",value = "delete from comment where userid=?1 and newsid=?2",nativeQuery = true)
    int delUserNews(int userid,int newsid);




}
