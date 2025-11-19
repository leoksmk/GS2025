package br.com.fiap.ai_horizon_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // Para desenvolvimento: libera o front local (web/Expo)
                        .allowedOriginPatterns(
                                "http://localhost:8081",
                                "http://localhost:19006",
                                "http://127.0.0.1:8081",
                                "http://127.0.0.1:19006",
                                "*" // se quiser deixar bem aberto em dev
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
