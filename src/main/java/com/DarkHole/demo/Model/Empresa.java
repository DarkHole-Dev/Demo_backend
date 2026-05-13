package com.darkhole.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_empresa")
public class Empresa {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nomeDaEmpresa;

    private String cnpj;

    private String emailEmpresarial;

    private boolean ativo=true;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
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
    public boolean getAtivo(){
        return ativo;
    }
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
}
