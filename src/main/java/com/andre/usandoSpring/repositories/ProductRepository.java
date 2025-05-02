package com.andre.usandoSpring.repositories;

import com.andre.usandoSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
