package com.daniel.vendaservice.repository;

import com.daniel.vendaservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
