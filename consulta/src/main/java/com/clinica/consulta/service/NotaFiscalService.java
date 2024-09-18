package com.clinica.consulta.service;

import com.clinica.consulta.clients.NotaFiscalClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

    private final NotaFiscalClient notaFiscalClient;

    public void emitit(Long consultaId) {
        notaFiscalClient.emitir(consultaId);
    }

}
