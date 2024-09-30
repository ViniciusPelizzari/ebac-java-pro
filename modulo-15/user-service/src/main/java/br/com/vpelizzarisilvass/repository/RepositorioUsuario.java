package br.com.vpelizzarisilvass.repository;

import br.com.user_service.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vinícius Pelizzari
 */

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
