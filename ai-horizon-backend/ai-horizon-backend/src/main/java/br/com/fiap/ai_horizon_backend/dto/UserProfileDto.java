package br.com.fiap.ai_horizon_backend.dto;

public class UserProfileDto {
    private String nome;
    private String email;
    private String cargo;
    private Double pesoKg;
    private Double altura;
    private String tipoSanguineo;
    private Integer idade;
    private Integer horasTrabalhoDia;

    // Getters e Setters
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
}
