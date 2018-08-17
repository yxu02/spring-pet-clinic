package edu.sjsu.xuy87.springpetclinic.controller;

import edu.sjsu.xuy87.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String showOwner(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
