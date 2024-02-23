package com.example.demo.servicio;

import com.example.demo.DTO.UsuarioRegistroDTO;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;


public interface UsuarioService {
    public Usuario save(UsuarioRegistroDTO registroDTO);

}
