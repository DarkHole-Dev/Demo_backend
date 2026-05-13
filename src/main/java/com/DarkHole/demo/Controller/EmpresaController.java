package com.darkhole.demo.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darkhole.demo.Service.EmpresaService;
import com.darkhole.demo.dto.Request.EmpresaRequestDTO;
import com.darkhole.demo.dto.Response.EmpresaResponseDTO;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    
    private EmpresaService service;


    @PostMapping
    public ResponseEntity<EmpresaResponseDTO> cadastrarEmpresa(@RequestBody @Valid EmpresaRequestDTO dto) {
        EmpresaResponseDTO response = service.salvarEmpresa(dto);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity <EmpresaResponseDTO> buscarPorId(@PathVariable Long id){
        EmpresaResponseDTO response = service.buscarPorId(id);
        return ResponseEntity.ok(response);
    }    
}
