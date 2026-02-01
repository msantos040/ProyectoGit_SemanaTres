package com.equipo.Menu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String menu() {
        return "menu"; 
    }

    @GetMapping("/boj")
    public String boj() {
        return "boj";
    }

    @GetMapping("/orellana")
    public String orellana() {
        return "orellana";
    }

    @GetMapping("/santos")
    public String santos() {
        return "santos";
    }

    @GetMapping("/sierra")
    public String sierra() {
        return "sierra";
    }

    @GetMapping("/yoj")
    public String yoj() {
        return "yoj";
    }
}