package com.clinica.paciente.controller;

import com.clinica.paciente.model.Paciente;
import com.clinica.paciente.service.PacienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class PacienteController {

    private final PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(pacienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        log.info("Buscando paciente por ID: {}", id);
        Optional<Paciente> optPaciente = pacienteService.findById(id);
        if (optPaciente.isPresent()) {
            return ResponseEntity.ok(optPaciente.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        pacienteService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Paciente paciente) {
        Paciente saved = pacienteService.create(paciente);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Paciente paciente) {
        pacienteService.update(paciente);
        return ResponseEntity.ok().build();
    }

}
