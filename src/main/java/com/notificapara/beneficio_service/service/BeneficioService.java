package com.notificapara.beneficio_service.service;

import com.notificapara.beneficio_service.dto.BeneficioRequestDTO;
import com.notificapara.beneficio_service.dto.BeneficioResponseDTO;
import com.notificapara.beneficio_service.model.Beneficio;
import com.notificapara.beneficio_service.repository.BeneficioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeneficioService {

    private final BeneficioRepository beneficioRepository;

    public BeneficioResponseDTO salvar(BeneficioRequestDTO dto) {
        Beneficio beneficio = new Beneficio();
        beneficio.setNomeBeneficio(dto.nomeBeneficio());
        beneficio.setCpfBeneficiario(dto.cpfBeneficiario());
        beneficio.setValor(dto.valor());
        beneficio.setDataConcessao(dto.dataConcessao());
        beneficio.setOrigem(dto.origem());

        Beneficio salvo = beneficioRepository.save(beneficio);
        return new BeneficioResponseDTO(
                salvo.getId(),
                salvo.getNomeBeneficio(),
                salvo.getCpfBeneficiario(),
                salvo.getValor(),
                salvo.getDataConcessao(),
                salvo.getOrigem()
        );
    }

    public List<BeneficioResponseDTO> listarTodos() {
        return beneficioRepository.findAll().stream()
                .map(b -> new BeneficioResponseDTO(
                        b.getId(),
                        b.getNomeBeneficio(),
                        b.getCpfBeneficiario(),
                        b.getValor(),
                        b.getDataConcessao(),
                        b.getOrigem()
                ))
                .toList();
    }

}
