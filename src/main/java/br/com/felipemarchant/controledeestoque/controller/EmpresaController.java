package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Empresa;
import br.com.felipemarchant.controledeestoque.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private final EmpresaService service;

    @Autowired
    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Empresa> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> show(@PathVariable long id) throws Exception {
        Empresa tipoData = service.findById(id).orElseThrow(() -> new Exception("Empresa não encontrada"));
        return ResponseEntity.ok(tipoData);
    }

    @PostMapping
    public Empresa store(@RequestBody Empresa empresa) {
        return service.save(empresa);
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa) {
        return service.save(empresa);
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
