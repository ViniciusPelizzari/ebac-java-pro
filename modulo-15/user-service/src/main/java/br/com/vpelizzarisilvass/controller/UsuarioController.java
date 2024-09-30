package br.com.vpelizzarisilvass.controller;

import br.com.user_service.entity.Usuario;
import br.com.user_service.service.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vinícius Pelizzari
 */

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
    @Autowired
    private ServicoUsuario servicoUsuario;

    @GetMapping
    public List<Usuario> buscaUsuarios() {
        return servicoUsuario.listaTodosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return servicoUsuario.novoUsuario(usuario);
    }
}
