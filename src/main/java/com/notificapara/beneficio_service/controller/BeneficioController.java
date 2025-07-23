package com.notificapara.beneficio_service.controller;

import com.notificapara.beneficio_service.model.Beneficio;
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
    public List<Beneficio> listarTodos() {
        return beneficioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Beneficio> criar(@Valid @RequestBody Beneficio beneficio) {
        Beneficio salvo = beneficioService.salvar(beneficio);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

}
