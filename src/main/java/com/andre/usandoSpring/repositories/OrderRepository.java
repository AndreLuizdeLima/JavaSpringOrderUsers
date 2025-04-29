package com.andre.usandoSpring.repositories;

import com.andre.usandoSpring.entities.Order;
import com.andre.usandoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
