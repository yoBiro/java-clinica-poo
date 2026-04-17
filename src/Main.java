import java.util.*;
import java.time.LocalDateTime;
import model.Pessoa;
import model.Consulta;
import model.Paciente;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do paciente: ");
        String nome = sc.nextLine();

        System.out.println("Insira a consulta: ");
        String texto = sc.nextLine();

        String[] consultaArray = { texto };

        Consulta consulta = new Consulta(1, consultaArray, LocalDateTime.now());

        Paciente paciente = new Paciente(nome, 1, consulta);
        paciente.setNome(nome);

        System.out.println("Paciente " + paciente.getNome() + " cadastrado com sucesso!");
        System.out.println(LocalDateTime.now());
        
        System.out.println("O paciente passará pela: "+paciente.getConsulta().getConsulta()[0]);
        
        sc.close();
    }
}