package model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {

    private int idMedico;
    private Especialidade especialidade;
    private List<Consulta> consultas;

    public Medico(int idMedico, Especialidade especialidade, String nome) {
        super(nome);
        this.idMedico = idMedico;
        this.especialidade = especialidade;
        this.consultas = new ArrayList<>();
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

    // 🔹 Adiciona uma consulta ao médico
    public void adicionarConsulta(Consulta consulta) {
        if (consulta != null) {
            consultas.add(consulta);
        }
    }

    // 🔹 Lista todas as consultas do médico
    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada para o médico " + getNome());
            return;
        }

        System.out.println("Consultas do médico " + getNome() + ":");

        for (Consulta c : consultas) {
            System.out.println("----------------------------");
            System.out.println("ID: " + c.getIdConsulta());
            System.out.println("Data: " + c.getDataConsulta());

            if (c.getConsulta() != null) {
                String[] dados = c.getConsulta();

                // [0] = sintomas, [1] = diagnóstico, [2] = tratamento
                if (dados.length > 0) System.out.println("Sintomas: " + dados[0]);
                if (dados.length > 1) System.out.println("Observações: " + dados[1]);
                if (dados.length > 2) System.out.println("Receita: " + dados[2]);
            }
        }
    }

    // 🔹 Exibe dados do médico
    public void exibirDados() {
        System.out.println("===== MÉDICO =====");
        System.out.println("ID: " + idMedico);
        System.out.println("Nome: " + getNome());

        if (especialidade != null) {
            System.out.println("Especialidade: " + especialidade.getNomeEspecialidade());
        } else {
            System.out.println("Especialidade: Não definida");
        }
    }

}