package com.notificapara.beneficio_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "beneficios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_beneficio", nullable = false, length = 100)
    private String nomeBeneficio;

    @Column(name = "cpf_beneficiario", nullable = false, length = 11)
    private String cpfBeneficiario;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "data_concessao", nullable = false)
    private LocalDate dataConcessao;

    @Column(name = "origem", nullable = false, length = 100)
    private String origem;

}
