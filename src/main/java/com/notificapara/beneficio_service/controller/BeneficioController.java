package com.notificapara.beneficio_service.controller;

import com.notificapara.beneficio_service.model.Beneficio;
import com.notificapara.beneficio_service.repository.BeneficioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/beneficios")
public class BeneficioController {

    private final BeneficioRepository beneficioRepository;

    @GetMapping
    public List<Beneficio> listarTodos() {
        return beneficioRepository.findAll();
    }

    @PostMapping
    public Beneficio salvar(@RequestBody Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

}
