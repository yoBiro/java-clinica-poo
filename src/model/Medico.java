package model;

public class Medico extends Pessoa {
    private int idMedico;
    private Especialidade especialidade;

    public Medico(int idMedico, Especialidade especialidade, String nome) {
        super(nome);
        this.idMedico = idMedico;
        this.especialidade = especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
