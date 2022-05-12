package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

//    @PostMapping("/salvarValores")
//    public String salvar(String primeiro, String segundo){
//        System.out.println("Salvando os valores informados: " + primeiro + " " + segundo);
//        return "bemVindo";
//    }

    @PostMapping("/salvarValores")
    public ModelAndView salvar(String primeiro, String segundo){
        System.out.println("Salvando os valores informados: " + primeiro + " " + segundo);

        ModelAndView model = new ModelAndView("bemVindo");
        model.addObject("primeiro", primeiro);
        model.addObject("segundo", segundo);
        return model;
    }

    @GetMapping("/formController")
    public String exibir(){
        return "form";
    }
}
