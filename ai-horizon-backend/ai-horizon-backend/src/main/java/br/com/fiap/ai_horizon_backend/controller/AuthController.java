package br.com.fiap.ai_horizon_backend.controller;

import br.com.fiap.ai_horizon_backend.dto.UserProfileDto;
import br.com.fiap.ai_horizon_backend.model.User;
import br.com.fiap.ai_horizon_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    public static class LoginRequest {
        public String email;
        public String senha;
    }

    public static class LoginResponse {
        public String token;
        public UserProfileDto user;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest req) {
        User user = userService.autenticar(req.email, req.senha);

        // Convertendo o usuário para um DTO
        UserProfileDto userProfile = new UserProfileDto();
        userProfile.setNome(user.getNome());
        userProfile.setEmail(user.getEmail());
        userProfile.setCargo(user.getCargo());
        userProfile.setPesoKg(user.getPesoKg());
        userProfile.setAltura(user.getAltura());
        userProfile.setTipoSanguineo(user.getTipoSanguineo());
        userProfile.setIdade(user.getIdade());
        userProfile.setHorasTrabalhoDia(user.getHorasTrabalhoDia());

        LoginResponse resp = new LoginResponse();
        resp.token = "some_token";  // Gere seu token conforme necessário
        resp.user = userProfile;

        return resp;
    }
}
