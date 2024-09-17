package com.clinica.consulta.service;

import com.clinica.consulta.clients.MedicoClient;
import com.clinica.consulta.model.Medico;
import com.clinica.consulta.model.Paciente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoClient medicoClient;

    public Medico getById(Long id) {
        return medicoClient.getById(id);
//        var serverUrl = String.format("http://localhost:8082/%d", id);
//        RestClient restClient = RestClient.create();
//        return restClient
//                .get()
//                .uri(serverUrl)
//                .retrieve()
//                .toEntity(Medico.class).getBody();
    }
    
}
