package com.example.Demo5.dao;

import com.example.Demo5.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
