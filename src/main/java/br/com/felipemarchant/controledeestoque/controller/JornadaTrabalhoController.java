package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.JornadaTrabalho;
import br.com.felipemarchant.controledeestoque.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    private final JornadaService service;

    @Autowired
    public JornadaTrabalhoController(JornadaService service) {
        this.service = service;
    }

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return service.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable long id) throws Exception {
        JornadaTrabalho jornada = service.findById(id).orElseThrow(() -> new Exception("Jornada não encontrada"));
        return ResponseEntity.ok(jornada);
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return service.save(jornadaTrabalho);
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
