package com.example.Demo5.service;

import com.example.Demo5.dao.IProductRepo;
import com.example.Demo5.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private IProductRepo iProductRepo;
    public void addProduct(Product product) {
        iProductRepo.save(product);
    }
}
