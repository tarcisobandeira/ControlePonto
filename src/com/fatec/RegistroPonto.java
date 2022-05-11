package com.fatec;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto(long idRegPonto, Funcionario func, LocalDate dataRegistro, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        this.idRegPonto = idRegPonto;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "============================================" +
                "\nFuncionário: " + func.getNome() +
                "\nData do Registro: " + dataRegistro +
                "\nHora da Entrada: " + horaEntrada +
                "\nHora da Saida: " + horaSaida;
    }
}
