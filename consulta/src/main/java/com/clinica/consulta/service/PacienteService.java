package com.clinica.consulta.service;

import com.clinica.consulta.clients.PacienteClient;
import com.clinica.consulta.model.Paciente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteClient pacienteClient;

    public Paciente getById(Long id) {
        return pacienteClient.getById(id);
//        var serverUrl = String.format("http://localhost:8081/%d", id);
//        RestClient restClient = RestClient.create();
//        return restClient
//                .get()
//                .uri(serverUrl)
//                .retrieve()
//                .toEntity(Paciente.class).getBody();
    }

}
