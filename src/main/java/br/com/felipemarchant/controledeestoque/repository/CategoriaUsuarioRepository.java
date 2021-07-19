package br.com.felipemarchant.controledeestoque.repository;

import br.com.felipemarchant.controledeestoque.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}
