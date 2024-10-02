package com.sys.order.config;

import com.sys.order.model.Order;
import com.sys.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class ApplicationInitConfig {

    @Bean
    ApplicationRunner applicationRunner(OrderRepository orderRepository){
        log.info("Init Application config .............");

        return args -> {
            boolean userOrderFirst = orderRepository.existsById(1L);

            if (!userOrderFirst){
                log.info("Insert data......");
                Order order = Order
                        .builder()
                        .id(1L)
                        .customerId(123L)
                        .orderDate(ZonedDateTime.now())
                        .totalAmount(BigDecimal.ONE)
                        .build();
                orderRepository.save(order);
            }


        };

    }

}
