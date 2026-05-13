package com.darkhole.demo.dto.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmpresaRequestDTO {
    
    @NotBlank
    private String nomeDaEmpresa;

    @NotBlank
    private String cnpj;

    @Email
    @NotBlank
    private String emailEmpresarial;

    @NotNull
    private UsuarioRequestDTO admin;

    public String getNomeDaEmpresa(){
        return nomeDaEmpresa;
    }
    public void setNomeDaEmpresa(String nomeDaEmpresa){
        this.nomeDaEmpresa = nomeDaEmpresa;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getEmailEmpresarial(){
        return emailEmpresarial;
    }
    public void setEmailEmpresarial(String emailEmpresarial){
        this.emailEmpresarial = emailEmpresarial;
    }
    public UsuarioRequestDTO getAdmin(){
        return admin;
    }
    public void setAdmin(UsuarioRequestDTO admin){
        this.admin = admin;
    }
}
