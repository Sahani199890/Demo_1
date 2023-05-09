package com.example.Demo5.dao;


import com.example.Demo5.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<CustomerModel,Integer> {
}
