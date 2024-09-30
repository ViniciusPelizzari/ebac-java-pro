package br.com.vpelizzarisilvas.repository;

import br.com.meme_service.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vinícius Pelizzari
 */

public interface RepositorioMeme extends JpaRepository<Meme, Long> {


}
