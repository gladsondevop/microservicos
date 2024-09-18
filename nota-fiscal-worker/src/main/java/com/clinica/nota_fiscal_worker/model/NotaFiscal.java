package com.clinica.nota_fiscal_worker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NotaFiscal {
    private Long id;
    private String consultaId;
    private Status status;
}