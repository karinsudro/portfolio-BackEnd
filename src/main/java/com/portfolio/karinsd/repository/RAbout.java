package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RAbout extends JpaRepository<About, Integer>{
    
}
