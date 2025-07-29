package com.notificapara.beneficio_service.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record BeneficioResponseDTO(Long id,
                                   String nomeBeneficio,
                                   String cpfBeneficiario,
                                   BigDecimal valor,
                                   LocalDate dataConcessao,
                                   String origem)
{ }
