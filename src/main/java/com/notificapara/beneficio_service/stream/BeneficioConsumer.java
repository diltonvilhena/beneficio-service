package com.notificapara.beneficio_service.stream;

import com.notificapara.beneficio_service.model.Beneficio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class BeneficioConsumer {

    @Bean
    public Consumer<Beneficio> consumirBeneficio() {
        return beneficio -> {
            System.out.println("Mensagem recebida no tópico: " + beneficio);
        };
    }

    @Bean
    public Consumer<Beneficio> receberBeneficio() {
        return beneficio -> {
            System.out.println("Recebido do Kafka: " + beneficio);
        };
    }

}
