package com.kipper.vendaservice.repository;

import com.kipper.vendaservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
