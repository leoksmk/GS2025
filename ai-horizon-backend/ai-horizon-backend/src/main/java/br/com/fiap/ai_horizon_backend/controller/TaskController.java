package br.com.fiap.ai_horizon_backend.controller;

import br.com.fiap.ai_horizon_backend.model.Task;
import br.com.fiap.ai_horizon_backend.model.TaskStatus;
import br.com.fiap.ai_horizon_backend.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true") // Modificado para permitir somente a origem do front
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // LISTAR TAREFAS
    @GetMapping
    public List<Task> listar() {
        return service.listar();
    }

    // DETALHE (usado se precisar, o app hoje só usa a lista)
    @GetMapping("/{id}")
    public Task buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // ACEITAR SUGESTÃO
    @PostMapping("/{id}/aceitar")
    public Task aceitar(@PathVariable Long id) {
        return service.atualizarStatus(id, TaskStatus.ACEITO);
    }

    // REJEITAR SUGESTÃO
    @PostMapping("/{id}/rejeitar")
    public Task rejeitar(@PathVariable Long id) {
        return service.atualizarStatus(id, TaskStatus.REJEITADO);
    }
}
