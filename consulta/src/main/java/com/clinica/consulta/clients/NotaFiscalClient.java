package com.clinica.consulta.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("NOTA-FISCAL-SERVICE")
public interface NotaFiscalClient {

    @GetMapping("/emitir/{consultaId}")
    void emitir(@PathVariable Long consultaId);

}
