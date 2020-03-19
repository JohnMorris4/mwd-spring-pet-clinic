package com.morrisje.mwdspringpetclinic.controllers;

import com.morrisje.mwdspringpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/index"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}