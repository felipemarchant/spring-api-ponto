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

    @Autowired
    private JornadaService service;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
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

}
