package com.clinica.consulta.clients;

import com.clinica.consulta.model.Medico;
import com.clinica.consulta.model.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MEDICO-SERVICE")
public interface MedicoClient {

    @GetMapping("/{id}")
    Medico getById(@PathVariable Long id);

}
