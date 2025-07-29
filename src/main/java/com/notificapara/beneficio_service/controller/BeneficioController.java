package com.notificapara.beneficio_service.controller;

import com.notificapara.beneficio_service.dto.BeneficioRequestDTO;
import com.notificapara.beneficio_service.dto.BeneficioResponseDTO;
import com.notificapara.beneficio_service.service.BeneficioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/beneficios")
public class BeneficioController {

    private final BeneficioService beneficioService;

    @GetMapping
    public List<BeneficioResponseDTO> listarTodos() {
        return beneficioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<BeneficioResponseDTO> criar(@Valid @RequestBody BeneficioRequestDTO dto) {
        BeneficioResponseDTO salvo = beneficioService.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

}
