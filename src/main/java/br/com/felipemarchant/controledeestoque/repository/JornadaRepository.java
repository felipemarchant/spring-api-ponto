package br.com.felipemarchant.controledeestoque.repository;

import br.com.felipemarchant.controledeestoque.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
