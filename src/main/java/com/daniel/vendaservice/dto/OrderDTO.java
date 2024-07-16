package com.daniel.vendaservice.dto;

public record OrderDTO(String productId, Integer quantity, String paymentType) {
}
