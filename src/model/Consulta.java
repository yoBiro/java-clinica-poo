package model;

import java.time.LocalDateTime;

public class Consulta {
    private int idConsulta;
    private String[] consulta; // [0]=sintomas, [1]=observações, [2]=receita
    private LocalDateTime dataConsulta;
    private Paciente paciente;
    private Medico medico;

    public Consulta(int idConsulta, int tamanhoArray, LocalDateTime dataConsulta) {
        this.idConsulta = idConsulta;
        this.consulta = new String[tamanhoArray];
        this.dataConsulta = dataConsulta;
    }

    // GETTERS
    public int getIdConsulta() {
        return idConsulta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public String[] getConsulta() {
        return consulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    // SETTERS CONTROLADOS
    protected void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    protected void setMedico(Medico medico) {
        this.medico = medico;
    }



    // Preencher dados fixos da consulta
    public void setDados(String sintomas, String observacoes, String receita) {
        if (consulta.length > 0) consulta[0] = sintomas;
        if (consulta.length > 1) consulta[1] = observacoes;
        if (consulta.length > 2) consulta[2] = receita;
    }

    // Verifica se está totalmente agendada
    public boolean estaAgendada() {
        return paciente != null && medico != null;
    }
}