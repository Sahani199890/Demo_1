package com.example.Demo5.service;

import com.example.Demo5.dao.IAddressRepo;
import com.example.Demo5.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private IAddressRepo iAddressRepo;
    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }
}
