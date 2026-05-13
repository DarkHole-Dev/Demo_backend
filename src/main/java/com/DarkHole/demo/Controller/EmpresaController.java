package com.darkhole.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darkhole.demo.Service.EmpresaService;


@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    
    private EmpresaService service;
}
