package com.example.demo.servicio;

import com.example.demo.DTO.UsuarioRegistroDTO;
import com.example.demo.model.Rol;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UsuarioServiceImpl implements  UsuarioService{
    private UsuarioRepository usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        Usuario user=new Usuario(registroDTO.getNombre(),registroDTO.getApellido(), registroDTO.getEmail(), registroDTO.getPassword(),Arrays.asList(new Rol("ROLER_USER")) );
        return  usuarioRepo.save(user);
    }
}
