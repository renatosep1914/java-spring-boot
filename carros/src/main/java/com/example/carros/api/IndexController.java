package com.example.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping()
    public String get(){
        return "Get Spring Boot";
    }
    @GetMapping("/login")
    public String get(@RequestParam("login") String login, @RequestParam("senha") String senha){
        return "Login: " + login +", senha: " + senha;
    }

}
