package edu.sjsu.xuy87.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String showOwner(){
        return "owner/index";
    }
}
