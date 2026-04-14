package model;

public class Paciente extends Pessoa {
    private int idPaciente;
    private Consulta consulta;

    public Paciente(String nome, int idPaciente, Consulta consulta) {
        super(nome);
        this.idPaciente = idPaciente;
        this.consulta = consulta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
