package com.example.cap2;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaginaInicial {

    @GetMapping("/")
    String home(){
        return "Olá Spring Boot!!";
    }
}
