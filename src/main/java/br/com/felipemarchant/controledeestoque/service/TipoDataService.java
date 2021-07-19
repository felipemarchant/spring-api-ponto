package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.TipoData;
import br.com.felipemarchant.controledeestoque.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    private final TipoDataRepository repository;

    @Autowired
    public TipoDataService(TipoDataRepository repository) {
        this.repository = repository;
    }

    public List<TipoData> findAll() {
        return repository.findAll();
    }

    public Optional<TipoData> findById(long id) {
        return repository.findById(id);
    }

    public TipoData save(TipoData tipoData) {
        return repository.save(tipoData);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
