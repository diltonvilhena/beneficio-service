package com.notificapara.beneficio_service.repository;

import com.notificapara.beneficio_service.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio,Long> {


}
