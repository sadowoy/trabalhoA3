import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa
{
    String telefone, endereco;
    List<Responsavel> listaResponaveis = new ArrayList<>();

    public Responsavel(String nome, String idade, String dataNascmineto, String telefone, String endereco)
    {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Responsavel()
    {

    }


    @Override
    public void cadastro()
    {
        System.out.println("Escreva o nome do responsável: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade do responsável: ");
        idade = entrada.nextLine();

        System.out.println("Digite a data de nascimento do responsável: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Digite o telefone do responsável: ");
        telefone = entrada.nextLine();

        System.out.println("Digite o endereço do responsável: ");
        endereco = entrada.nextLine();

        Responsavel responsavel = new Responsavel(nome, idade, dataNascimento, telefone, endereco);
        listaResponaveis.add(responsavel);
    }

    @Override
    public void listar()
    {
        System.out.println("Lista de responsáveis: \n");
        for (int i = 0; i < listaResponaveis.size(); i++)
        {
            System.out.println("//////////////////////////////////");
            System.out.println("Nome do responsável: " + listaResponaveis.get(i).nome);
            System.out.println("Telefone do responsável: " + listaResponaveis.get(i).telefone);
            System.out.println("Idade do responsável " + listaResponaveis.get(i).idade);
            System.out.println("Data de nascimento do responsável " +listaResponaveis.get(i).dataNascimento);
            System.out.println("Endereço do responsável " +listaResponaveis.get(i).endereco);
            System.out.println("//////////////////////////////////");
        }
    }
}
