package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.Calendario;
import br.com.felipemarchant.controledeestoque.model.TipoData;
import br.com.felipemarchant.controledeestoque.repository.CalendarioRepository;
import br.com.felipemarchant.controledeestoque.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    private final CalendarioRepository repository;

    @Autowired
    public CalendarioService(CalendarioRepository repository) {
        this.repository = repository;
    }

    public List<Calendario> findAll() {
        return repository.findAll();
    }

    public Optional<Calendario> findById(long id) {
        return repository.findById(id);
    }

    public Calendario save(Calendario calendario) {
        return repository.save(calendario);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
