package com.miga.springboot.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miga.springboot.ecommerce.model.Product;
import com.miga.springboot.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductList() {
        return (List<Product>) productRepository.findAll();
    }
}
