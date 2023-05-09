package com.example.Demo5.service;

import com.example.Demo5.dao.IAddressRepo;
import com.example.Demo5.dao.ICustomerRepo;
import com.example.Demo5.model.Address;
import com.example.Demo5.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private ICustomerRepo iCustomerRepo;
    @Autowired
    private IAddressRepo iAddressRepo;
    public void addCustomer(CustomerModel customerModel) {
        List<Address> list = customerModel.getAddress();
//        List<Address> addressesList=new ArrayList<>();
        for(Address address:list){
            if(!iAddressRepo.findById(address.getAddressId()).isPresent()){
                iAddressRepo.save(address);
            }
        }
        iCustomerRepo.save(customerModel);
    }
}
