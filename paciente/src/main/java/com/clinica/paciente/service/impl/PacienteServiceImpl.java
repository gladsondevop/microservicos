package com.clinica.paciente.service.impl;

import com.clinica.paciente.model.Paciente;
import com.clinica.paciente.repository.PacienteRepository;
import com.clinica.paciente.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Override
    public Paciente create(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Optional<Paciente> findById(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Paciente update(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
