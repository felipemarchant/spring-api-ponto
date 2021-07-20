package br.com.felipemarchant.controledeestoque.service;

import br.com.felipemarchant.controledeestoque.model.NivelAcesso;
import br.com.felipemarchant.controledeestoque.model.TipoData;
import br.com.felipemarchant.controledeestoque.repository.NivelAcessoRepository;
import br.com.felipemarchant.controledeestoque.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    private final NivelAcessoRepository repository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository repository) {
        this.repository = repository;
    }

    public List<NivelAcesso> findAll() {
        return repository.findAll();
    }

    public Optional<NivelAcesso> findById(long id) {
        return repository.findById(id);
    }

    public NivelAcesso save(NivelAcesso nivelAcesso) {
        return repository.save(nivelAcesso);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
