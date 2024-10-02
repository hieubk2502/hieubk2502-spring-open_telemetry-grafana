package com.sys.order.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    Long id;

    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "order_date")
    ZonedDateTime orderDate;

    @Column(name = "total_amount")
    BigDecimal totalAmount;

}