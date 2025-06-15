import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa
{
    String matricula, turma, turno, responsavel;
    List<Aluno> listaAlunos = new ArrayList<>();

public Aluno()
{

}


public Aluno(String nome, String idade, String dataNascimento, String matricula, String turma, String turno, String responsavel)
{
    this.nome = nome;
    this.idade = idade;
    this.dataNascimento = dataNascimento;
    this.matricula = matricula;
    this.turma = turma;
    this.turno = turno;
    this.responsavel = responsavel;
}

@Override
    public void cadastro()
    {
        System.out.println("escreva o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade do aluno: ");
        idade = entrada.nextLine();

        System.out.println("Digite a data de nascimento do aluno: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Insira o número de matricula do aluno: ");
        matricula = entrada.nextLine();

        System.out.println("Digite a turma do aluno: ");
        turma = entrada.nextLine();

        System.out.println("Digite o turno do aluno: ");
        turno = entrada.nextLine();

        System.out.println("Escreva o nome do responsável do aluno: ");
        responsavel = entrada.nextLine();

        Aluno aluno = new Aluno(nome, idade, dataNascimento, matricula, turma, turno, responsavel);
        listaAlunos.add(aluno);
        System.out.println(aluno.nome + " foi adicionado!");
    }

    @Override
    public void listar()
    {
        System.out.println("Lista de alunos: \n");

        for (int i = 0; i < listaAlunos.size(); i++)
        {
            System.out.println("//////////////////////////////////");
            System.out.println("Aluno: " + listaAlunos.get(i).nome);
            System.out.println("Turma: " + listaAlunos.get(i).turma);
            System.out.println("Turno : " + listaAlunos.get(i).turno);
            System.out.println("Nome do responsável: " + listaAlunos.get(i).responsavel);
            System.out.println("Número de matricula: " + listaAlunos.get(i).matricula);
            System.out.println("//////////////////////////////////");
        }
    }
}
