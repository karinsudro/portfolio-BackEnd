package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository<Skill, Integer>{
    //?
    //List<Skill> findBySkillTipoId(int id);  //retorna los skills especificados según tipo de skill
    
    //@Transactional
    //void deleteBySkillTipoId(int SkillTipo_id);  //? borra todos los skills especificados según tipo de skill
    
}
