package com.agung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author awanlabs
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {
    
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Halo Indonesiaku :-)");
        return "index";
    }
    
    @RequestMapping(value = "halo",method = RequestMethod.GET)
    public String halo(Model model){
        model.addAttribute("message", "Halo, Selamat Belajar Spring :-)");
        return "halo";
    }
}
