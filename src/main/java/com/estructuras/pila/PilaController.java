package com.estructuras.pila;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PilaController {

    private final Pila<String> pila = new Pila<>();

    @PostMapping("/insertar")
    public String insertar(@RequestParam String elemento) {
        pila.agregar(elemento);
        return "Se insertó: " + elemento;
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminar() {
        try {
            String quitado = pila.quitar();
            return ResponseEntity.ok("Se eliminó: " + quitado);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/ver")
    public List<String> ver() {
        pila.mostrar(); 
        return pila.obtenerElementos();
    }

    @GetMapping("/tamanyo")
    public int tamanyo() {
        return pila.size();
    }
}
