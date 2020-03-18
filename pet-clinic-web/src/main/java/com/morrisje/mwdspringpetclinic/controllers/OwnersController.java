package com.morrisje.mwdspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {
    @RequestMapping({"/owners", "/owners/index"})
    public String index(){
        return "owners/index";
    }
}
