package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.CategoriaUsuario;
import br.com.felipemarchant.controledeestoque.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria-usuario")
public class CategoriaUsuarioController {

    private final CategoriaUsuarioService service;

    @Autowired
    public CategoriaUsuarioController(CategoriaUsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoriaUsuario> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> show(@PathVariable long id) throws Exception {
        CategoriaUsuario categoria = service.findById(id).orElseThrow(() -> new Exception("Categoria não encontrada"));
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public CategoriaUsuario store(@RequestBody CategoriaUsuario categoriaUsuario) {
        return service.save(categoriaUsuario);
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario) {
        return service.save(categoriaUsuario);
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
