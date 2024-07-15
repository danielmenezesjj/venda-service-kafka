package com.kipper.vendaservice.dto;

public record OrderDTO(Integer productId, Integer quantity, String paymentType) {
}
