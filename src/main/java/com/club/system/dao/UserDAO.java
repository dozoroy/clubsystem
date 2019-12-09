package com.club.system.dao;
import com.club.system.bean.Club;
import  com.club.system.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer>{

   @Query("select user from User user")
   List<User> findALLByUser();

   List<User> findAllByUsernameContaining(String username);

   User getByUsernameAndPasswordAndType(String username,String password,String type);

   User findByUserid(int userid);

   List<User> findAllByUserid(int userid);

}
