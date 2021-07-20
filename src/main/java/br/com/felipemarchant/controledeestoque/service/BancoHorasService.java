package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.BancoHoras;
import br.com.felipemarchant.controledeestoque.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    private final BancoHorasRepository repository;

    @Autowired
    public BancoHorasService(BancoHorasRepository repository) {
        this.repository = repository;
    }

    public List<BancoHoras> findAll() {
        return repository.findAll();
    }

    public Optional<BancoHoras> findById(long id) {
        return repository.findById(id);
    }

    public BancoHoras save(BancoHoras bancoHoras) {
        return repository.save(bancoHoras);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
