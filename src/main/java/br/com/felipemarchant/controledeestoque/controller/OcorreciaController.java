package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Ocorrencia;
import br.com.felipemarchant.controledeestoque.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorreciaController {

    private final OcorrenciaService service;

    @Autowired
    public OcorreciaController(OcorrenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ocorrencia> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> show(@PathVariable long id) throws Exception {
        Ocorrencia ocorrencia = service.findById(id).orElseThrow(() -> new Exception("Ocorrencia não encontrada"));
        return ResponseEntity.ok(ocorrencia);
    }

    @PostMapping
    public Ocorrencia store(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);
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
