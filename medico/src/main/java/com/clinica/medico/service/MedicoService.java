package com.clinica.medico.service;

import com.clinica.medico.model.Medico;
import com.clinica.medico.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public List<Medico> getAll(){
        return medicoRepository.findAll();
    }

    public Optional<Medico> getById(long id){
        return medicoRepository.findById(id);
    }
}
