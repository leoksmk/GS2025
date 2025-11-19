package br.com.fiap.ai_horizon_backend.repository;

import br.com.fiap.ai_horizon_backend.model.User;
import br.com.fiap.ai_horizon_backend.model.UserMetrics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserMetricsRepository extends JpaRepository<UserMetrics, Long> {

    Optional<UserMetrics> findTopByUserOrderByColetadoEmDesc(User user);
}
