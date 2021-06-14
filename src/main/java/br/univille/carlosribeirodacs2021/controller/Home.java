package br.univille.carlosribeirodacs2021.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Home {
    
    @GetMapping
    public ModelAndView index(){  
        Date dateNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        HashMap<String,String> dados = new HashMap<>();
        dados.put("tempo", sdf.format(dateNow));
        dados.put("nomeapp","App Java!");

        return new ModelAndView("home/index", dados);
    }  
}


