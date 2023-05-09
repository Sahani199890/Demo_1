package com.example.Demo5.cotroller;

import com.example.Demo5.model.Address;
import com.example.Demo5.model.CustomerModel;
import com.example.Demo5.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("add-customer")
    public String addCustomer(@RequestBody CustomerModel customerModel) {
        customerService.addCustomer(customerModel);
        return "Customer is added with Id " + customerModel.getUserId();
    }
}
