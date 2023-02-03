package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProject  extends JpaRepository<Project, Integer>{
    
}
