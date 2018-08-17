package edu.sjsu.xuy87.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet", "/vet/", "/vet/index", "/vet/index.html"})
    public String vetList(){
        return "vet/index";
    }
}
