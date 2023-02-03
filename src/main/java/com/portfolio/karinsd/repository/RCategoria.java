package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RCategoria  extends JpaRepository<Categoria, Integer>{
    
}
