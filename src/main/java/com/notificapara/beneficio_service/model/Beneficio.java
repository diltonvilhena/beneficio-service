package com.notificapara.beneficio_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "beneficios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeBeneficio;

    @Column(nullable = false)
    private String cpfBeneficiario;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDate dataConcessao;

    @Column(nullable = false)
    private String origem; // Ex: "Renda Pará", "Bolsa Alimentação"

}
