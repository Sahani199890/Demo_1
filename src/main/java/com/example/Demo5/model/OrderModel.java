package com.example.Demo5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_tbl")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @ManyToMany
    private List<CustomerModel> customerId;
    @ManyToMany
    private List<Product> productId;
    @ManyToMany
    private List<Address> addressesId;
}
