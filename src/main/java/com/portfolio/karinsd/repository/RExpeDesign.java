package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.ExpeDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RExpeDesign extends JpaRepository<ExpeDesign, Integer>{
    
    
}
