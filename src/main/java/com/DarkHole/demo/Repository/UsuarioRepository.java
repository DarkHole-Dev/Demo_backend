package com.darkhole.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkhole.demo.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
