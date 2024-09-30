package br.com.vpelizzarisilva.service;

import br.com.categoria_meme.entity.CategoriaDeMeme;
import br.com.categoria_meme.repository.RepositorioCategoriaDeMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Vinícius Pelizzari
 */

@Component
public class ServicoCategoriaDeMeme {
    @Autowired
    private RepositorioCategoriaDeMeme repositorioCategoriaDeMeme;

    public CategoriaDeMeme novaCategoriaMeme(CategoriaDeMeme categoriaMeme) {
        return repositorioCategoriaDeMeme.save(categoriaMeme);
    }

    public List<CategoriaDeMeme> listaTodasCategorias() {
        return repositorioCategoriaDeMeme.findAll();
    }
}
