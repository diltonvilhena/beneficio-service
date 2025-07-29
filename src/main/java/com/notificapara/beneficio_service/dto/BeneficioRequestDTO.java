package com.notificapara.beneficio_service.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record BeneficioRequestDTO(
        @NotBlank String nomeBeneficio,
        @NotBlank @Size(min = 11, max = 11) String cpfBeneficiario,
        @NotNull @DecimalMin("0.01") BigDecimal valor,
        @NotNull LocalDate dataConcessao,
        @NotBlank String origem
) {}
