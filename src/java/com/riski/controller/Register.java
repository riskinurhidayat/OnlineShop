/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")

public class Register {

    private Object registerBean;
    @RequestMapping
     public String goToRegister(Model model){
       RegisterFormBean registerBean = new RegisterFormBean();
       model.addAttribute("registerBean", registerBean);
       return "register";
       
    }
     @RequestMapping(value = "/save")
     public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model){
         System.out.println("User Firstname: " + registerBean.getFirstName());
         model.addAttribute("data", registerBean);
         return "succsessregistration";
         
     }
    
    
}
