package com.example.Demo5.service;

import com.example.Demo5.dao.IOrderRepo;
import com.example.Demo5.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private IOrderRepo iOrderRepo;
    public void addOrder(OrderModel orderModel) {
        iOrderRepo.save(orderModel);
    }
}
