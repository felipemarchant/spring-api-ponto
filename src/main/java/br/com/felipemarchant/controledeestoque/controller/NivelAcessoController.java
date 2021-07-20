package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.NivelAcesso;
import br.com.felipemarchant.controledeestoque.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel-acesso")
public class NivelAcessoController {

    private final NivelAcessoService service;

    @Autowired
    public NivelAcessoController(NivelAcessoService service) {
        this.service = service;
    }

    @GetMapping
    public List<NivelAcesso> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> show(@PathVariable long id) throws Exception {
        NivelAcesso nivelAcesso = service.findById(id).orElseThrow(() -> new Exception("Nivel de Acesso não encontrado"));
        return ResponseEntity.ok(nivelAcesso);
    }

    @PostMapping
    public NivelAcesso store(@RequestBody NivelAcesso nivelAcesso) {
        return service.save(nivelAcesso);
    }

    @PutMapping
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso) {
        return service.save(nivelAcesso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        try {
            service.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }
}
