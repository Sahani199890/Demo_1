package com.example.Demo5.cotroller;

import com.example.Demo5.dao.IAddressRepo;
import com.example.Demo5.model.Address;
import com.example.Demo5.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;
    @PostMapping("addAddress")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "address is added with Id "+address.getAddressId();
    }
}
