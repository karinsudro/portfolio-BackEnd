package com.portfolio.ksd.repository;

import com.portfolio.ksd.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RRed extends JpaRepository<Red, Integer>{
    
}
