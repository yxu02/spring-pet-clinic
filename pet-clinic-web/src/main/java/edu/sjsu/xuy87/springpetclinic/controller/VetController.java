package edu.sjsu.xuy87.springpetclinic.controller;

import edu.sjsu.xuy87.springpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String vetList(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
