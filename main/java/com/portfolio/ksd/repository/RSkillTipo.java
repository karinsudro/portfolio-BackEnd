package com.portfolio.ksd.repository;

import com.portfolio.ksd.entity.SkillTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RSkillTipo extends JpaRepository<SkillTipo, Integer>{
    
}
