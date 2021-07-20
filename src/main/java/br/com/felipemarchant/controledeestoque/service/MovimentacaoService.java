package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.Movimentacao;
import br.com.felipemarchant.controledeestoque.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository repository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository repository) {
        this.repository = repository;
    }

    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    public Optional<Movimentacao> findById(long id) {
        return repository.findById(id);
    }

    public Movimentacao save(Movimentacao movimentacao) {
        return repository.save(movimentacao);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
