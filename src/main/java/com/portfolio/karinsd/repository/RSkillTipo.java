package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.SkillTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkillTipo extends JpaRepository<SkillTipo, Integer>{
    //List<SkillTipo> findBySkill_Tipo(String skill_tipo);
}
