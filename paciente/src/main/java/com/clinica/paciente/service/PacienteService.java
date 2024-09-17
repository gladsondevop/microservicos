package com.clinica.paciente.service;

import com.clinica.paciente.model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {

    Paciente create(Paciente paciente);
    Optional<Paciente> findById(Long id);
    List<Paciente> findAll();
    void deleteById(Long id);
    Paciente update(Paciente paciente);

}
