package com.ryan.oauth2.org.security.repository;

import com.ryan.oauth2.org.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT DISTINCT user FROM User user "+
//                "inner join FETCH user.authorities AS authories " +
//                "WHERE user.username = :username")
//    User findOneByUsername(@Param("username") String username);
    User findOneByUsername(@Param("username") String username);
}
