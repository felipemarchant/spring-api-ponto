package br.com.felipemarchant.controledeestoque.controller;

import br.com.felipemarchant.controledeestoque.model.Usuario;
import br.com.felipemarchant.controledeestoque.service.UsuarioService;
import br.com.felipemarchant.controledeestoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    @Autowired
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> show(@PathVariable long id) throws Exception {
        Usuario usuario = service.findById(id).orElseThrow(() -> new Exception("Usuario não encontrado"));
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public Usuario store(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return service.save(usuario);
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
