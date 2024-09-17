package com.clinica.medico.controller;

import com.clinica.medico.model.Medico;
import com.clinica.medico.service.MedicoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class MedicoController {

    private final MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok(medicoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        log.info("Buscando medico por ID: ", id);
        Optional<Medico> optional = medicoService.getById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
