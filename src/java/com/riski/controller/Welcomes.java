/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/welcomes")
public class Welcomes {
    
    @RequestMapping()
    public String index(Model model){
        model.addAttribute("msg","Belanja Murah");
        return "welcome";
    }
    
}
