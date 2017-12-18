/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riski.controller;

import com.riski.dao.ProductService;
import com.riski.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/product")

public class ProdukController {
     @Autowired
    ProductService ps;
     @RequestMapping(value = "/all")
    public String showAllCustomers(Model model) {
        List<Product> product = ps.findAll();
        model.addAttribute("product", product);
        return "product";
    }
    
    @RequestMapping(value = "{productId}")
    public String showOneCustomer(@PathVariable Integer productId, Model model) {
        Product product = ps.findById(productId);
        model.addAttribute("product", product);
        return "detail";
    }
}


