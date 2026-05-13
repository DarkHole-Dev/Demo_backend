package com.darkhole.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkhole.demo.Model.Empresa;
import com.darkhole.demo.Model.Role;
import com.darkhole.demo.Model.Usuario;
import com.darkhole.demo.Repository.EmpresaRepository;
import com.darkhole.demo.Repository.UsuarioRepository;
import com.darkhole.demo.dto.Request.EmpresaRequestDTO;
import com.darkhole.demo.dto.Response.EmpresaResponseDTO;

import jakarta.transaction.Transactional;

@Service
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired UsuarioRepository usuarioRepository;

    @Transactional
    public EmpresaResponseDTO salvarEmpresa (EmpresaRequestDTO dto){

        Empresa empresaEntidade = new Empresa();

        empresaEntidade.setNomeDaEmpresa(dto.getNomeDaEmpresa());
        empresaEntidade.setCnpj(dto.getCnpj());
        empresaEntidade.setEmailEmpresarial(dto.getEmailEmpresarial());
        Empresa empresaSalva = empresaRepository.save(empresaEntidade);

        Usuario admin = new Usuario();

        admin.setNome(dto.getAdmin().getNome());
        admin.setEmail(dto.getAdmin().getEmail());
        admin.setSenha(dto.getAdmin().getSenha());
        admin.setRole(Role.ADMIN);
        admin.setEmpresa(empresaSalva);
        usuarioRepository.save(admin);

        return new EmpresaResponseDTO(empresaSalva);
        
    }
}
