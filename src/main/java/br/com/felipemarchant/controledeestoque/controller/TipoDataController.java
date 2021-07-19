package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.TipoData;
import br.com.felipemarchant.controledeestoque.service.TipoDataService;
import br.com.felipemarchant.controledeestoque.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-data")
public class TipoDataController {

    private final TipoDataService service;

    @Autowired
    public TipoDataController(TipoDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoData> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoData> show(@PathVariable long id) throws Exception {
        TipoData tipoData = service.findById(id).orElseThrow(() -> new Exception("Tipo data não encontrada"));
        return ResponseEntity.ok(tipoData);
    }

    @PostMapping
    public TipoData store(@RequestBody TipoData tipoData) {
        return service.save(tipoData);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData) {
        return service.save(tipoData);
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
