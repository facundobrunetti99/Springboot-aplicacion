package com.example.demo.controlador;

import com.example.demo.DTO.UsuarioRegistroDTO;
import com.example.demo.servicio.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
    private UsuarioService usuarioService;

    public RegistroUsuarioControlador(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioDto(){
        return  new UsuarioRegistroDTO();

    }

    @GetMapping
    public String MostrarFormulario(){
        return "registro";
    }

    @PostMapping
    public String RegistrarCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
        usuarioService.save(registroDTO);
        return "redirect:/registro?exito";

    }
}
