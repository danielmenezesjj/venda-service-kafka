package com.kipper.vendaservice.services;


import com.kipper.vendaservice.model.Order;
import com.kipper.vendaservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {


    @Autowired
    private OrderRepository orderRepository;

    public Order create(Order order){
        return orderRepository.save(order);
    }

}
