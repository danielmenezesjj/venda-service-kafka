package com.daniel.vendaservice.controller;


import com.daniel.vendaservice.model.Order;
import com.daniel.vendaservice.dto.OrderDTO;
import com.daniel.vendaservice.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {


    @Autowired
    private KafkaTemplate<String, OrderDTO> kafkaTemplate;

    @Autowired
    private OrderServices services;

    @PostMapping
    public ResponseEntity realizarVenda(@RequestBody OrderDTO dto){
        Order order = new Order(dto);
        kafkaTemplate.send("estoque-topico", dto);
        services.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);

    }

}
