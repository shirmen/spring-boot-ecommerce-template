package com.miga.springboot.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.miga.springboot.ecommerce.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

}
