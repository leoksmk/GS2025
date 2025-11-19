package br.com.fiap.ai_horizon_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cargo;
    private Double pesoKg;
    private Double altura;
    private String tipoSanguineo;
    private Integer idade;
    private Integer horasTrabalhoDia;
    private String senha;  // Adicionando o campo senha

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getHorasTrabalhoDia() {
        return horasTrabalhoDia;
    }

    public void setHorasTrabalhoDia(Integer horasTrabalhoDia) {
        this.horasTrabalhoDia = horasTrabalhoDia;
    }

    public String getSenha() {
        return senha;  // Getter para o campo senha
    }

    public void setSenha(String senha) {
        this.senha = senha;  // Setter para o campo senha
    }
}
