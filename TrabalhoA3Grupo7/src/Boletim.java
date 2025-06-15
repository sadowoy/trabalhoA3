import java.util.Scanner;

public class Boletim implements IAvalia
{

    private double nota1, nota2, nota3, media;
    private int faltas, diasLetivos;
    private String disciplina, aluno, condicao;

    public Boletim()
    {

    }

    public Boletim(double nota1, double nota2, double nota3, double media, String aluno, int faltas, String disciplina, String condicao, int diasLetivos) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.disciplina = disciplina;
        this.faltas = faltas;
        this.aluno = aluno;
        this.condicao = condicao;
    }

    public int getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(int diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public void cadastraBoletim()
    {
        System.out.println("Escreva o nome do aluno: ");
        setAluno(entrada.next());

        System.out.println("Escreva a disciplina: ");
        setDisciplina(entrada.next());

        System.out.println("Escreva a nota 1: ");
        setNota1(entrada.nextDouble());

        System.out.println("Escreva a nota 2: ");
        setNota2(entrada.nextDouble());

        System.out.println("Escreva a nota 3: ");
        setNota3(entrada.nextDouble());

        System.out.println("Escreva o número de faltas do aluno: ");
        setFaltas(entrada.nextInt());

        System.out.println("Escreva a quantidade de dias letivos previstos");
        setDiasLetivos(entrada.nextInt());

        setMedia( (getNota1() + getNota2() + getNota3() ) / 3);

        if(getFaltas() > (getDiasLetivos() / 4) || getMedia() < 7)
        {
            setCondicao("Reprovado");
        }
        else
        {
            setCondicao("Aprovado");
        }

        Boletim boletim = new Boletim(getNota1(), getNota2(), getNota3(), getMedia(), getAluno(), getFaltas(), getDisciplina(), getCondicao(), getDiasLetivos());
        boletins.add(boletim);
    }


    @Override
    public void listaBoletins()
    {
        System.out.println("Boletins cadastrados: ");

        for(int i = 0; i < boletins.size(); i++)
        {
            System.out.println("Boletim numero " + (i+1) + ":");
            System.out.println("Aluno: " +boletins.get(i).aluno);
            System.out.println("Disciplina: " + boletins.get(i).disciplina + "\n");

        }
    }

    @Override
    public void mostraBoletim(int escolha)
    {
        System.out.println("Boletim do aluno " + boletins.get(escolha).aluno + ":");
        System.out.println("Disciplina: " + boletins.get(escolha).disciplina);
        System.out.println("Nota 1: " + boletins.get(escolha).nota1);
        System.out.println("Nota 2: " + boletins.get(escolha).nota2);
        System.out.println("Nota 3: " + boletins.get(escolha).nota3);
        System.out.println("Média: " + boletins.get(escolha).media);
        System.out.println("Número de faltas: " + boletins.get(escolha).faltas);
        System.out.println("O aluno foi: " + boletins.get(escolha).condicao);
    }


    @Override
    public void procuraBoletim()
    {
        System.out.println("Digite o nome do aluno que você quer consultar o boletim:");
        String nome = entrada.next();

        for(int i = 0; i < boletins.size(); i++)
        {
            if (nome.equals(boletins.get(i).aluno))
            {
                System.out.println("Boletim de " + boletins.get(i).aluno + " encontrado!");
                mostraBoletim(i);
                menu.menu();
                break;
            }
            else if (i >= boletins.size())
            {
                System.out.println("Aluno não encontrado! Cadastre o aluno ou escreva o nome correto.");
                menu.escolheBoletim();
                break;
            }
        }
    }





}
