package br.com.vpelizzarisilva.controller;

import br.com.categoria_meme.entity.CategoriaDeMeme;
import br.com.categoria_meme.service.ServicoCategoriaDeMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vinícius Pelizzari
 */

@RestController
@RequestMapping(path = "/categoria-de-memes")
public class CategoriaDeMemeController {

    @Autowired
    private ServicoCategoriaDeMeme servicoCategoriaDeMeme;

    @GetMapping
    public List<CategoriaDeMeme> buscaCategorias() {
        return servicoCategoriaDeMeme.listaTodasCategorias();
    }

    @PostMapping
    public CategoriaDeMeme novaCategoria(@RequestBody CategoriaDeMeme categoriaDeMeme) {
        return servicoCategoriaDeMeme.novaCategoriaMeme(categoriaDeMeme);
    }
}
