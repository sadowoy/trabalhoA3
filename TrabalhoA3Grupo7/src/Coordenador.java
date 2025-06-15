import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario
{
    String departamento, turno;
    List<Coordenador> listaCoordenadores = new ArrayList<>();


    public Coordenador(String nome, String iadde, String dataNascimento, String email, String cargo,
                       double salario, String departamento, String turno)
    {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.turno = turno;
    }

    public Coordenador()
    {

    }


    @Override
    public void cadastro()
    {
        System.out.println("Escreva o nome do coordenador: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade do coordenador: ");
        idade = entrada.nextLine();

        System.out.println("Digite a data de nascimento do coordenador: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Digite o e-mail do coordenador: ");
        email = entrada.nextLine();

        System.out.println("Digite o cargo do coordenador: ");
        cargo = entrada.nextLine();

        System.out.println("Digite o salário do coordenador: ");
        salario = entrada.nextDouble();
        entrada.nextLine(); // Consumir a quebra de linha após double

        System.out.println("Digite o departamento do coordenador: ");
        departamento = entrada.nextLine();

        System.out.println("Digite o turno do coordenador: ");
        turno = entrada.nextLine();

        Coordenador coordenador = new Coordenador(nome, idade, dataNascimento, email, cargo, salario, departamento, turno);
        listaCoordenadores.add(coordenador);
        System.out.println(coordenador.nome + " foi cadastrado!");
    }

    @Override
    public void listar()
    {
        for (int i = 0; i < listaCoordenadores.size(); i++) {
            System.out.println("//////////////////////////////////");
            System.out.println("Nome do coordenador: " + listaCoordenadores.get(i).nome);
            System.out.println("Idade do coordenador: " + listaCoordenadores.get(i).idade);
            System.out.println("Data de nascimento do coordenador: " + listaCoordenadores.get(i).dataNascimento);
            System.out.println("Email do coordenador: " + listaCoordenadores.get(i).email);
            System.out.println("Cargo do coordenador: " + listaCoordenadores.get(i).cargo);
            System.out.println("Salário do coordenador: " + listaCoordenadores.get(i).salario);
            System.out.println("Departamento do coordenador: " + listaCoordenadores.get(i).departamento);
            System.out.println("Turno do coordenador: " + listaCoordenadores.get(i).turno);
            System.out.println("//////////////////////////////////");
        }
    }
}
