package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Localidade;
import br.com.felipemarchant.controledeestoque.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    private final LocalidadeService service;

    @Autowired
    public LocalidadeController(LocalidadeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Localidade> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> show(@PathVariable long id) throws Exception {
        Localidade localidade = service.findById(id).orElseThrow(() -> new Exception("Localidade não encontrada"));
        return ResponseEntity.ok(localidade);
    }

    @PostMapping
    public Localidade store(@RequestBody Localidade localidade) {
        return service.save(localidade);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade) {
        return service.save(localidade);
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
