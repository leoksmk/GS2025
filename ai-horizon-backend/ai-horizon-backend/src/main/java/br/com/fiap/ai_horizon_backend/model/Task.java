package br.com.fiap.ai_horizon_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 2000)
    private String descricao;

    @Column(name = "sugestao_ia", length = 2000)
    private String sugestaoIa;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task() {}

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSugestaoIa() {
        return sugestaoIa;
    }

    public void setSugestaoIa(String sugestaoIa) {
        this.sugestaoIa = sugestaoIa;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
