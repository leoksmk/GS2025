package br.com.fiap.ai_horizon_backend.controller;

import br.com.fiap.ai_horizon_backend.model.User;
import br.com.fiap.ai_horizon_backend.model.UserMetrics;
import br.com.fiap.ai_horizon_backend.repository.UserMetricsRepository;
import br.com.fiap.ai_horizon_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserMetricsController {

    private final UserRepository userRepository;
    private final UserMetricsRepository metricsRepository;

    public UserMetricsController(UserRepository userRepository, UserMetricsRepository metricsRepository) {
        this.userRepository = userRepository;
        this.metricsRepository = metricsRepository;
    }

    @GetMapping("/{id}/metrics/history")
    public List<UserMetrics> historico(@PathVariable Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // Filtra métricas desse usuário e ordena por data
        return metricsRepository.findAll().stream()
                .filter(m -> m.getUser() != null && m.getUser().getId().equals(user.getId()))
                .sorted((a, b) -> a.getColetadoEm().compareTo(b.getColetadoEm()))
                .toList();
    }
}
