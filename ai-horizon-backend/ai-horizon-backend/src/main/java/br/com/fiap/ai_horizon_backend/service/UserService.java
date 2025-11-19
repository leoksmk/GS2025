package br.com.fiap.ai_horizon_backend.service;

import br.com.fiap.ai_horizon_backend.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Este método faz a autenticação do usuário, retornando um objeto User
    public User autenticar(String email, String senha) {
        // Aqui você deve buscar o usuário pelo email e senha fornecidos
        // Este é apenas um exemplo de retorno.
        User user = new User();
        user.setNome("Nome Exemplo");
        user.setEmail(email);
        user.setCargo("Cargo Exemplo");
        user.setPesoKg(75.0);
        user.setAltura(1.75);
        user.setTipoSanguineo("O+");
        user.setIdade(30);
        user.setHorasTrabalhoDia(8);
        return user;
    }
}
