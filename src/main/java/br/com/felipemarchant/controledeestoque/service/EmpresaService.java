package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.Empresa;
import br.com.felipemarchant.controledeestoque.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    private final EmpresaRepository repository;

    @Autowired
    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public List<Empresa> findAll() {
        return repository.findAll();
    }

    public Optional<Empresa> findById(long id) {
        return repository.findById(id);
    }

    public Empresa save(Empresa empresa) {
        return repository.save(empresa);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
