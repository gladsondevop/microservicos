package com.clinica.nota_fiscal.repository;

import com.clinica.nota_fiscal.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {
}
