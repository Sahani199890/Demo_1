package com.example.Demo5.cotroller;

import com.example.Demo5.model.Address;
import com.example.Demo5.model.OrderModel;
import com.example.Demo5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("addOrder")
    public String addOrder(@RequestBody OrderModel orderModel){
        orderService.addOrder(orderModel);
        return "Order is added with Id "+orderModel.getOrderId();
    }
}
