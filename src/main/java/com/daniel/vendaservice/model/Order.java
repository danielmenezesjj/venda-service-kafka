package com.daniel.vendaservice.model;


import com.daniel.vendaservice.dto.OrderDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String produtctId;
    private Integer quantity;
    private String paymentType;


    public Order(OrderDTO dto){
        this.produtctId = dto.productId();
        this.quantity = dto.quantity();
        this.paymentType = dto.paymentType();
    }



}
