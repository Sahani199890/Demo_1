package com.example.Demo5.dao;

import com.example.Demo5.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<OrderModel,Integer> {
}
