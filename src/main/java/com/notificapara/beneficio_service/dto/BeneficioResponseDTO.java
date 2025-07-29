package com.notificapara.beneficio_service.dto;

import com.notificapara.beneficio_service.model.Beneficio;
import java.math.BigDecimal;
import java.time.LocalDate;

public record BeneficioResponseDTO(Long id,
        String nomeBeneficio,
        String cpfBeneficiario,
        BigDecimal valor,
        LocalDate dataConcessao,
        String origem) {

    public BeneficioResponseDTO(Beneficio b) {
        this(b.getId(),
                b.getNomeBeneficio(),
                b.getCpfBeneficiario(),
                b.getValor(),
                b.getDataConcessao(),
                b.getOrigem());
    }
}
