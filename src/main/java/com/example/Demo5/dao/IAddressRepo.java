package com.example.Demo5.dao;

import com.example.Demo5.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
