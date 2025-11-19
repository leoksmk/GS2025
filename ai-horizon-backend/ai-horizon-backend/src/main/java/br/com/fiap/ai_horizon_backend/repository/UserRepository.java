package br.com.fiap.ai_horizon_backend.repository;

import br.com.fiap.ai_horizon_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndSenha(String email, String senha);
}
