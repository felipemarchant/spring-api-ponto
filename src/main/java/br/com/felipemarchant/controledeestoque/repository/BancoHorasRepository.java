package br.com.felipemarchant.controledeestoque.repository;

import br.com.felipemarchant.controledeestoque.model.BancoHoras;
import br.com.felipemarchant.controledeestoque.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
