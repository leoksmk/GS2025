package br.com.fiap.ai_horizon_backend.service;

import br.com.fiap.ai_horizon_backend.model.Task;
import br.com.fiap.ai_horizon_backend.model.TaskStatus;
import br.com.fiap.ai_horizon_backend.repository.TaskRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    // Popula tarefas iniciais no banco H2
    @PostConstruct
    public void seedTasks() {
        if (repository.count() == 0) {
            // 1) Inspeção de rota do braço robótico
            Task t1 = new Task();
            t1.setTitulo("Inspeção de rota do braço robótico");
            t1.setDescricao("Verificar se o braço robótico está seguindo a trajetória programada sem colisões " +
                    "com grades, células de segurança ou operadores na área de trabalho.");
            t1.setSugestaoIa("""
                    IA sugere:
                    • Reexecutar o ciclo em modo lento (safe mode) com operador acompanhando.
                    • Registrar vídeo do movimento para comparação com o trajeto de referência.
                    • Checar se houve alteração recente no layout da célula ou na calibração dos eixos.
                    """);
            t1.setStatus(TaskStatus.PENDENTE);

            // 2) Inspeção de rota da esteira 1
            Task t2 = new Task();
            t2.setTitulo("Inspeção de rota da esteira 1");
            t2.setDescricao("Conferir alinhamento da esteira 1, sensores fim de curso e áreas de risco de estrangulamento.");
            t2.setSugestaoIa("""
                    IA sugere:
                    • Verificar sensores de presença/fotocélulas na entrada e saída da esteira.
                    • Medir distância de segurança entre corrimãos, proteções e estrutura fixa.
                    • Validar se o botão de emergência está acessível em toda a rota.
                    """);
            t2.setStatus(TaskStatus.PENDENTE);

            // 3) Inspeção de rota da esteira 2
            Task t3 = new Task();
            t3.setTitulo("Inspeção de rota da esteira 2");
            t3.setDescricao("Checar pontos de acúmulo de produto, ruídos anormais e trepidações na esteira 2.");
            t3.setSugestaoIa("""
                    IA sugere:
                    • Mapear trechos com vibração acima do normal e registrar em checklist digital.
                    • Verificar tensão da correia e condição dos roletes.
                    • Programar parada rápida para intervenção segura, se necessário.
                    """);
            t3.setStatus(TaskStatus.PENDENTE);

            // 4) Inspeção de rota da esteira 3
            Task t4 = new Task();
            t4.setTitulo("Inspeção de rota da esteira 3");
            t4.setDescricao("Avaliar interface da esteira 3 com paletizadores, AGVs e áreas de passagem de pessoas.");
            t4.setSugestaoIa("""
                    IA sugere:
                    • Confirmar que AGVs não compartilham rota com pedestres sem segregação física.
                    • Validar sinalização luminosa/sonora em cruzamentos de fluxo.
                    • Revisar parâmetros de parada suave para evitar tombamento de cargas.
                    """);
            t4.setStatus(TaskStatus.PENDENTE);

            repository.save(t1);
            repository.save(t2);
            repository.save(t3);
            repository.save(t4);
        }
    }

    public List<Task> listar() {
        return repository.findAll();
    }

    public Task buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public Task atualizarStatus(Long id, TaskStatus novoStatus) {
        Task t = buscarPorId(id);
        t.setStatus(novoStatus);
        return repository.save(t);
    }
}
