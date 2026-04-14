package model;

import java.time.LocalDateTime;

public class Consulta {
    private int idConsulta;
    private String[] consulta;
    private LocalDateTime dataConsulta;
    private Medico idMedico;
    private Paciente idPaciente;

    public Consulta(int idConsulta, String[] consulta, LocalDateTime dataConsulta) {
        this.idConsulta = idConsulta;
        this.consulta = consulta;
        this.dataConsulta = dataConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String[] getConsulta() {
        return consulta;
    }

    public void setConsulta(String[] consulta) {
        this.consulta = consulta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
