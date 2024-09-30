package br.com.vpelizzarisilva.meme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.meme.entity.Meme;

/**
 * @author Vinícius Pelizzari
 */

public interface MemeRepository extends CrudRepository<Meme, Long> {

}
