package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.BancoHoras;
import br.com.felipemarchant.controledeestoque.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco-horas")
public class BancoHorasController {

    private final BancoHorasService service;

    @Autowired
    public BancoHorasController(BancoHorasService service) {
        this.service = service;
    }

    @GetMapping
    public List<BancoHoras> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> show(@PathVariable long id) throws Exception {
        BancoHoras bancoHoras = service.findById(id).orElseThrow(() -> new Exception("Banco de horas não encontrado"));
        return ResponseEntity.ok(bancoHoras);
    }

    @PostMapping
    public BancoHoras store(@RequestBody BancoHoras bancoHoras) {
        return service.save(bancoHoras);
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras bancoHoras) {
        return service.save(bancoHoras);
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
