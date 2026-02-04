package com.equipo.Menu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String menu() {
        return "menu"; 
    }

    @GetMapping("/datos_boj")
    public String datos_boj() {
        return "datos_boj";
    }

    @GetMapping("/boj")
    public String boj() {
        return "boj";
    }

    @GetMapping("/orellana")
    public String orellana() {
        return "orellana";
    }

    @GetMapping("/orellana_datos")
    public String orellana_datos() {
        return "orellana_datos";
    }

    @GetMapping("/santos")
    public String santos() {
        return "santos";
    }

    @GetMapping("/santos_datos")
    public String santos_datos() {
        return "santos_datos";
    }

    @GetMapping("/sierra")
    public String sierra() {
        return "sierra";
    }

    @GetMapping("/sierra_datos")
    public String sierra_datos() {
        return "sierra_datos";
    }

    @GetMapping("/yoj")
    public String yoj() {
        return "yoj";
    }

    @GetMapping("/yoj_perfil")
    public String yoj_perfil() {
        return "yoj_perfil";
    }
}