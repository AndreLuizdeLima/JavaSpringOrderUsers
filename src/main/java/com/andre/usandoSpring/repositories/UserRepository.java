package com.andre.usandoSpring.repositories;

import com.andre.usandoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
