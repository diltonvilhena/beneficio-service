package com.notificapara.beneficio_service.dto;


import com.notificapara.beneficio_service.model.Beneficio;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BeneficioRequestDTO {

    private String nomeBeneficio;
    private String cpfBeneficiario;
    private BigDecimal valor;
    private LocalDate dataConcessao;
    private String origem;

    public Beneficio toEntity() {
        Beneficio beneficio = new Beneficio();
        beneficio.setNomeBeneficio(this.nomeBeneficio);
        beneficio.setCpfBeneficiario(this.cpfBeneficiario);
        beneficio.setValor(this.valor);
        beneficio.setDataConcessao(this.dataConcessao);
        beneficio.setOrigem(this.origem);
        return beneficio;
    }
}
