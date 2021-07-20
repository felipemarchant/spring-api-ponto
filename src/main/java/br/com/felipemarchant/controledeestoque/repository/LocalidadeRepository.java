package br.com.felipemarchant.controledeestoque.repository;

import br.com.felipemarchant.controledeestoque.model.Localidade;
import br.com.felipemarchant.controledeestoque.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
