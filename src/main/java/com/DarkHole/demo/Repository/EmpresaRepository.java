package com.darkhole.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkhole.demo.Model.Empresa;

public interface  EmpresaRepository extends JpaRepository<Empresa, Long> {
    
}
