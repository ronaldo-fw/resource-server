package com.rfw.oauth2.resourceserver.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReportController {

    @GetMapping("/report")
    public String reportar(){
        return "Reporte obtenido desde la API";
    }
}
