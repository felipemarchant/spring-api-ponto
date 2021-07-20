package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Calendario;
import br.com.felipemarchant.controledeestoque.model.TipoData;
import br.com.felipemarchant.controledeestoque.service.CalendarioService;
import br.com.felipemarchant.controledeestoque.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    private final CalendarioService service;

    @Autowired
    public CalendarioController(CalendarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Calendario> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> show(@PathVariable long id) throws Exception {
        Calendario calendario = service.findById(id).orElseThrow(() -> new Exception("Tipo data não encontrada"));
        return ResponseEntity.ok(calendario);
    }

    @PostMapping
    public Calendario store(@RequestBody Calendario calendario) {
        return service.save(calendario);
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario) {
        return service.save(calendario);
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
