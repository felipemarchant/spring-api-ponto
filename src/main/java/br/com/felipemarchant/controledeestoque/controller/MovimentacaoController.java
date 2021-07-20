package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Movimentacao;
import br.com.felipemarchant.controledeestoque.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    private final MovimentacaoService service;

    @Autowired
    public MovimentacaoController(MovimentacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Movimentacao> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> show(@PathVariable long id) throws Exception {
        Movimentacao movimentacao = service.findById(id).orElseThrow(() -> new Exception("Movimentacao não encontrada"));
        return ResponseEntity.ok(movimentacao);
    }

    @PostMapping
    public Movimentacao store(@RequestBody Movimentacao movimentacao) {
        return service.save(movimentacao);
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao) {
        return service.save(movimentacao);
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
