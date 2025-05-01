package com.andre.usandoSpring.repositories;

import com.andre.usandoSpring.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
