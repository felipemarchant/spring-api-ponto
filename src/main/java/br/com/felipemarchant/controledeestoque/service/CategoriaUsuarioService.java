package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.CategoriaUsuario;
import br.com.felipemarchant.controledeestoque.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    private final CategoriaUsuarioRepository repository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository repository) {
        this.repository = repository;
    }

    public List<CategoriaUsuario> findAll() {
        return repository.findAll();
    }

    public Optional<CategoriaUsuario> findById(long id) {
        return repository.findById(id);
    }

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return repository.save(categoriaUsuario);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
