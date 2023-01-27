package com.portfolio.ksd.repository;


import com.portfolio.ksd.entity.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExpLaboral extends JpaRepository<ExpLaboral, Integer>{
    
}
