package br.com.fiap.ai_horizon_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_metrics")
public class UserMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private User user;

    private Integer nivelCansaco;
    private Integer nivelEstresse;
    private Integer produtividade;
    private LocalDateTime coletadoEm;

    public UserMetrics() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getNivelCansaco() {
        return nivelCansaco;
    }

    public void setNivelCansaco(Integer nivelCansaco) {
        this.nivelCansaco = nivelCansaco;
    }

    public Integer getNivelEstresse() {
        return nivelEstresse;
    }

    public void setNivelEstresse(Integer nivelEstresse) {
        this.nivelEstresse = nivelEstresse;
    }

    public Integer getProdutividade() {
        return produtividade;
    }

    public void setProdutividade(Integer produtividade) {
        this.produtividade = produtividade;
    }

    public LocalDateTime getColetadoEm() {
        return coletadoEm;
    }

    public void setColetadoEm(LocalDateTime coletadoEm) {
        this.coletadoEm = coletadoEm;
    }
}
