package br.com.felipemarchant.controledeestoque.repository;

import br.com.felipemarchant.controledeestoque.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
