package com.example.Demo5.cotroller;

import com.example.Demo5.model.Address;
import com.example.Demo5.model.Product;
import com.example.Demo5.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("addProduct")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product is added with Id "+product.getProductId();
    }
}
