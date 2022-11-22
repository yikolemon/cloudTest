package com.yikolemon.dao;


import com.yikolemon.eneity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * yikolemon
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);
}
