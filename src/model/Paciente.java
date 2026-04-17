package model;

public class Paciente extends Pessoa {

    private int idPaciente;
    private Consulta consulta;

    public Paciente(String nome, int idPaciente) {
        super(nome);
        this.idPaciente = idPaciente;
    }

    // GETTERS
    public int getIdPaciente() {
        return idPaciente;
    }

    public Consulta getConsulta() {
        return consulta;
    }


    // Agendar consulta com médico
    public boolean agendarConsulta(Consulta consulta, Medico medico) {

        if (this.consulta != null) {
            System.out.println("Paciente já possui consulta!");
            return false;
        }

        if (consulta.estaAgendada()) {
            System.out.println("Consulta já está ocupada!");
            return false;
        }

        this.consulta = consulta;

        consulta.setPaciente(this);
        consulta.setMedico(medico);

        medico.adicionarConsulta(consulta);

        return true;
    }

    // Cancelar consulta
    public void cancelarConsulta() {
        if (consulta != null) {
            consulta.setPaciente(null);
            consulta.setMedico(null);
            this.consulta = null;
        }
    }

    // Ver consulta
    public void verConsulta() {
        if (consulta != null) {
            System.out.println("Paciente: " + getNome());
            System.out.println("Consulta ID: " + consulta.getIdConsulta());
            System.out.println("Data: " + consulta.getDataConsulta());
        } else {
            System.out.println("Nenhuma consulta agendada.");
        }
    }
}