package br.com.vpelizzarisilva.repository;

import br.com.categoria_meme.entity.CategoriaDeMeme;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vinícius Pelizzari
 */

public interface RepositorioCategoriaDeMeme extends JpaRepository<CategoriaDeMeme, Long> {
}
