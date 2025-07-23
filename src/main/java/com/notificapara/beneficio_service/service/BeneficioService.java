package com.notificapara.beneficio_service.service;

import com.notificapara.beneficio_service.model.Beneficio;
import com.notificapara.beneficio_service.repository.BeneficioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeneficioService {

    private final BeneficioRepository beneficioRepository;

    public List<Beneficio> listarTodos() {
        return beneficioRepository.findAll();
    }

    public Beneficio salvar(Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

}
