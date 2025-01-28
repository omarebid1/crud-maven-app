package com.controller;

import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "homePage";
    }

    @GetMapping("/add-product")
    public String addProduct() {
        return "addProductPage";
    }

    @PostMapping("")
    public String goToAddProductPage() {
        return "addProductPage";
    }

}
