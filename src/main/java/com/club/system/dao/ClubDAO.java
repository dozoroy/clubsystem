package com.club.system.dao;
import com.club.system.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import com.club.system.bean.Club;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ClubDAO extends JpaRepository<Club,Integer>, JpaSpecificationExecutor<Club> {

    @Query("select club from Club club")
    List<Club> findALLByClub();

    List<Club> findByClubnameContaining(String clubname);

    List<Club> findByClubid(int clubid);


}
