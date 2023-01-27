package com.portfolio.ksd.repository;

import com.portfolio.ksd.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RSkill extends JpaRepository<Skill, Integer>{
    
}
