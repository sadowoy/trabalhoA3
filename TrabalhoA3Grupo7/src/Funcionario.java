import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa
{
    double salario;
    String email, cargo;
    List<Funcionario> listaFuncionarios = new ArrayList<>();

    public Funcionario(String nome, String iadde, String dataNascimento,
                       String email, String cargo, double salario)
    {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {

    }


    @Override
    public void cadastro()
    {

        System.out.println("Escreva o nome do funcionário: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade do funcionário: ");
        idade = entrada.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Digite o e-mail do funcionário: ");
        email = entrada.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        cargo = entrada.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        salario = entrada.nextDouble();

        Funcionario funcioario = new Funcionario( nome, idade, dataNascimento, email,
                cargo, salario);
        listaFuncionarios.add(funcioario);

        System.out.println("O funcionário " + funcioario.nome + " foi cadastrado!");
    }

    @Override
    public void listar()
    {
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            System.out.println("//////////////////////////////////");
            System.out.println("Nome do funcionário: " + listaFuncionarios.get(i).nome);
            System.out.println("Idade do funcionário: " + listaFuncionarios.get(i).idade);
            System.out.println("Data de nascimento do funcionário: " + listaFuncionarios.get(i).dataNascimento);
            System.out.println("Email do funcionário: " + listaFuncionarios.get(i).email);
            System.out.println("Cargo do funcionário: " + listaFuncionarios.get(i).cargo);
            System.out.println("Salário do funcionário: " + listaFuncionarios.get(i).salario);
            System.out.println("//////////////////////////////////");
        }

    }
}
