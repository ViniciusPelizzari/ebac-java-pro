package br.com.vpelizzarisilvas.service;

import br.com.meme_service.entity.Meme;
import br.com.meme_service.repository.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author Vinícius Pelizzari
 */

@Component
public class ServiceMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public Meme memeDoDia(List<Meme> memes){
        Collections.shuffle(memes);
        return memes.get(0);
    }
}
