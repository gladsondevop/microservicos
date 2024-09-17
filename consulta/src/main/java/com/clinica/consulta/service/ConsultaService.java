package com.clinica.consulta.service;

import com.clinica.consulta.model.Consulta;
import com.clinica.consulta.repository.ConsultaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultaService {

    private final ConsultaRepository consultaRepository;

    public List<Consulta> getAll(){
        return consultaRepository.findAll();
    }

    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

}
