package com.portfolio.ksd.repository;

import com.portfolio.ksd.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducation extends JpaRepository<Education, Integer>{
    

}
