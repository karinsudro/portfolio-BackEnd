package com.portfolio.ksd.repository;


import com.portfolio.ksd.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RProject  extends JpaRepository<Project, Integer>{
    
}
