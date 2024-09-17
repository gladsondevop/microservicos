package com.clinica.consulta.clients;

import com.clinica.consulta.model.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PACIENTE-SERVICE")
public interface PacienteClient {

    @GetMapping("/{id}")
    Paciente getById(@PathVariable Long id);

}
