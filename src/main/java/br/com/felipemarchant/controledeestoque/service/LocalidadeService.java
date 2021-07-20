package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.Localidade;
import br.com.felipemarchant.controledeestoque.repository.LocalidadeRepository;
import br.com.felipemarchant.controledeestoque.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    private final LocalidadeRepository repository;

    @Autowired
    public LocalidadeService(LocalidadeRepository repository) {
        this.repository = repository;
    }

    public List<Localidade> findAll() {
        return repository.findAll();
    }

    public Optional<Localidade> findById(long id) {
        return repository.findById(id);
    }

    public Localidade save(Localidade localidade) {
        return repository.save(localidade);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
