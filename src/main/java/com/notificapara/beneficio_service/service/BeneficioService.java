package com.notificapara.beneficio_service.service;

import com.notificapara.beneficio_service.dto.BeneficioRequestDTO;
import com.notificapara.beneficio_service.dto.BeneficioResponseDTO;
import com.notificapara.beneficio_service.model.Beneficio;
import com.notificapara.beneficio_service.repository.BeneficioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeneficioService {

    private final BeneficioRepository beneficioRepository;
    private final StreamBridge streamBridge;

    public Beneficio salvar(BeneficioRequestDTO dto) {
        Beneficio salvo = beneficioRepository.save(dto.toEntity());
        enviarParaKafka(salvo);
        return salvo;
    }

    private void enviarParaKafka(Beneficio salvo) {
        streamBridge.send("enviarBeneficio-out-0", salvo);
    }

    public List<BeneficioResponseDTO> listarTodos() {
        return beneficioRepository.findAll().stream()
                .map(BeneficioResponseDTO::new)
                .toList();
    }
}
