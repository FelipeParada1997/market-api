package com.felipe.Market_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Pruebas de integración para verificar la carga correcta del contexto de la aplicación
 */
@SpringBootTest
@ActiveProfiles("test")
class MarketApiApplicationTests {

    @Test
    void contextLoads() {
        // Verifica que el contexto de Spring se carga correctamente
    }

}
