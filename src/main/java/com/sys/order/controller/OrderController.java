package com.sys.order.controller;

import com.sys.order.model.Order;
import com.sys.order.repository.OrderRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class OrderController {

    OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id"));
    }
}