import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario
{

    String disciplina, turno;
    List <Professor> listaProfessores = new ArrayList<>();

    public Professor()
    {
    }

    public Professor(String nome, String idade, String dataNascimento, String email, double salario, String diciplina, String turno)
    {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.salario = salario;
        this.disciplina = disciplina;
        this.turno = turno;
    }

    @Override
    public void cadastro()
    {
        System.out.println("Escreva o nome do professor: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade do professor: ");
        idade = entrada.nextLine();

        System.out.println("Digite a data de nascimento do professor: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Digite o e-mail do professor: ");
        email = entrada.nextLine();

        System.out.println("Digite o salário do professor: ");
        salario = entrada.nextDouble();
        entrada.nextLine(); // Consumir a quebra de linha após o double

        System.out.println("Digite a disciplina do professor: ");
        disciplina = entrada.nextLine();

        System.out.println("Digite o turno do professor: ");
        turno = entrada.nextLine();

        Professor professor = new Professor(nome, idade, dataNascimento, email, salario, disciplina, turno);
        System.out.println(professor.nome + " foi adicionado!");

        listaProfessores.add(professor);
    }

    @Override
    public void listar()
    {
        System.out.println("Lista de professores: \n");

        for (int i = 0; i < listaProfessores.size(); i++)
        {
            System.out.println("//////////////////////////////////");
            System.out.println(listaProfessores.get(i).nome);
            System.out.println(listaProfessores.get(i).idade);
            System.out.println(listaProfessores.get(i).dataNascimento);
            System.out.println(listaProfessores.get(i).email);
            System.out.println(listaProfessores.get(i).salario);
            System.out.println(listaProfessores.get(i).disciplina);
            System.out.println(listaProfessores.get(i).turno);
            System.out.println("//////////////////////////////////");
        }
    }
}
