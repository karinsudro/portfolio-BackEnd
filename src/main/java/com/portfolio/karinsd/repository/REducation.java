package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducation extends JpaRepository<Education, Integer>{
    
}
