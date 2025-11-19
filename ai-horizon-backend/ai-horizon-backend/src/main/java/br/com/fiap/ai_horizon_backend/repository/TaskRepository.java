package br.com.fiap.ai_horizon_backend.repository;

import br.com.fiap.ai_horizon_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
