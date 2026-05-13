package com.darkhole.demo.dto.Response;

import com.darkhole.demo.Model.Empresa;

public class EmpresaResponseDTO {
    
    private Long id;
    private String nomeDaEmpresa;
    private String cnpj;
    private String emailEmpresarial;

    public EmpresaResponseDTO(Empresa empresa) {
        this.id = empresa.getId();
        this.nomeDaEmpresa = empresa.getNomeDaEmpresa();
        this.cnpj = empresa.getCnpj();
        this.emailEmpresarial = empresa.getEmailEmpresarial();
    }

    public Long getId() {
        return id; 
    }
    public String getNomeDaEmpresa() {
        return nomeDaEmpresa; 
    }
    public String getCnpj() {
        return cnpj; 
    }
    public String getEmailEmpresarial() {
        return emailEmpresarial; 
    }

}
