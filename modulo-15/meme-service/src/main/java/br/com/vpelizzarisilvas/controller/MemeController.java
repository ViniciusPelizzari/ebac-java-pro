package br.com.vpelizzarisilvas.controller;

import br.com.meme_service.entity.Meme;
import br.com.meme_service.service.ServiceMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vinícius Pelizzari
 */

@RestController
@RequestMapping(path = "/memes")
public class MemeController {
    @Autowired
    private ServiceMeme serviceMeme;

    @GetMapping
    public List<Meme> buscaMemes() {
        return serviceMeme.listaTodosMemes();
    }

    @PostMapping
    public Meme novoMeme(@RequestBody Meme meme) {
        return serviceMeme.novoMeme(meme);
    }

    @GetMapping("/meme-do-dia")
    public Meme memeDoDia() {
        return serviceMeme.memeDoDia(serviceMeme.listaTodosMemes());
    }
}
