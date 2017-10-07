package com.miga.springboot.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miga.springboot.ecommerce.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("admin/user/list")
    public String getUserList(Model model) {
        model.addAttribute("users", userService.getUserList());
        return "admin/user/list";
    }
}
