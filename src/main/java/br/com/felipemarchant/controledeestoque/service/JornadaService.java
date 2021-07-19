package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.JornadaTrabalho;
import br.com.felipemarchant.controledeestoque.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    private final JornadaRepository repository;

    @Autowired
    public JornadaService(JornadaRepository repository) {
        this.repository = repository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return repository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return repository.findAll();
    }

    public Optional<JornadaTrabalho> findById(long id) {
        return repository.findById(id);
    }
}
