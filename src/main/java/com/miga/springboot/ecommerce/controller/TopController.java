package com.miga.springboot.ecommerce.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miga.springboot.ecommerce.service.ProductService;

@Controller
public class TopController {

    @Autowired
    private MessageSource message;

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }
}
