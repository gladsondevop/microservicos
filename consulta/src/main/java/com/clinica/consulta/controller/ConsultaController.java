package com.clinica.consulta.controller;

import com.clinica.consulta.model.Consulta;
import com.clinica.consulta.model.Medico;
import com.clinica.consulta.model.Paciente;
import com.clinica.consulta.service.ConsultaService;
import com.clinica.consulta.service.MedicoService;
import com.clinica.consulta.service.PacienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ConsultaController {

    private final ConsultaService consultaService;
    private final PacienteService pacienteService;
    private final MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<Consulta>> getAll() {
        return ResponseEntity.ok(consultaService.getAll());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Consulta consulta) {
        log.info("Buscando dados paciente: ", consulta.getIdPaciente());
        Paciente paciente = pacienteService.getById(consulta.getIdPaciente());
        consulta.setNomePaciente(paciente.getNome());

        log.info("Buscando dados medico: ", consulta.getIdMedico());
        Medico medico = medicoService.getById(consulta.getIdMedico());
        consulta.setNomeMedico(medico.getNome());

        log.info("Salvando consulta: ", consulta);
        Consulta saved = consultaService.salvar(consulta);
        return ResponseEntity.ok(Map.of("consulta", saved));
    }
}
