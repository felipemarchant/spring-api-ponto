package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.Ocorrencia;
import br.com.felipemarchant.controledeestoque.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    private final OcorrenciaRepository repository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<Ocorrencia> findAll() {
        return repository.findAll();
    }

    public Optional<Ocorrencia> findById(long id) {
        return repository.findById(id);
    }

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
