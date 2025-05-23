package com.andre.usandoSpring.services;

import com.andre.usandoSpring.entities.Order;
import com.andre.usandoSpring.entities.User;
import com.andre.usandoSpring.repositories.OrderRepository;
import com.andre.usandoSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
      return repository.findAll();
    };

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
