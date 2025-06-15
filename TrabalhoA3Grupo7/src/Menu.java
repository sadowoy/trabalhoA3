import java.util.Scanner;

public class Menu {
    Aluno aluno = new Aluno();
    Coordenador coordenador = new Coordenador();
    Responsavel responsavel = new Responsavel();
    Funcionario funcionario = new Funcionario();
    Professor professor = new Professor();
    Boletim boletim = new Boletim();

    Scanner entrada = new Scanner(System.in);
    int escolha;

    public Menu()
    {
    }


    public void menu() {
        System.out.println("****** Bem vindo ao menu! ******");
        System.out.println("Escolha uma opção: \n" +
                "1 - Cadastrar pessoa \n" +
                "2 - Listar pessoas \n" +
                "3 - Cadastrar, listar ou consultar boletim \n" +
                "4 - Sair");

        escolha = entrada.nextInt();

        switch (escolha) {
            case 1: {escolheCadastro();break;}

            case 2: {escolheLista();break;}

            case 3: {escolheBoletim();break;}

            case 4: {
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("Número invalido, tente novamente!");
                menu();
                break;
            }
        }
    }


        public void escolheBoletim()
        {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Cadastrar boletim \n" +
                    "2 - Listar boletins \n" +
                    "3 - Ver boletim específico \n" +
                    "4 - Voltar ao menu");
            escolha = entrada.nextInt();

            switch (escolha)
            {
                case 1: {boletim.cadastraBoletim();menu();break;}

                case 2: {boletim.listaBoletins();menu();break;}

                case 3:{boletim.procuraBoletim();menu();break;}

                case 4: {menu();break;}

                default:
                {
                    System.out.println("Número invalido, tente novamente");
                    escolheBoletim();
                    break;
                }

            }

        }



        public void escolheCadastro ()
        {
            System.out.println("O que você deseja cadastrar?");
            System.out.println("""
                    1 - Aluno\s
                    2 - Responsável\s
                    3 - Professor\s
                    4 - Coordenador\s
                    5 - Outro funcionario\s
                    6 - voltar ao menu""");
                    escolha = entrada.nextInt();

            switch (escolha) {
                case 1: {aluno.cadastro();menu();break;}

                case 2: {responsavel.cadastro();menu();break;}

                case 3: {professor.cadastro();menu();break;}

                case 4: {coordenador.cadastro();menu();break;}

                case 5: {funcionario.cadastro();menu();break;}

                case 6: {menu();break;}

                default:
                {
                    System.out.println("Opção invalida! Tente novamente: ");
                    escolheCadastro();
                }
            }
        }


            public void escolheLista()
            {
                System.out.println("Escolha uma das opções para listar: ");
                System.out.println("1 - Aluno \n" +
                        "2 - Responsável \n" +
                        "3 - Professor \n" +
                        "4 - Coordenador \n" +
                        "5 - Outro funcionário \n " +
                        "6 - voltar ao menu");
                escolha = entrada.nextInt();

                switch (escolha) {
                    case 1: {aluno.listar();menu();break;}

                    case 2: {responsavel.listar();menu();break;}

                    case 3: {professor.listar();menu();break;}

                    case 4: {coordenador.listar();menu();break;}

                    case 5: {funcionario.listar();menu();break;}

                    case 6: {menu();break;}

                    default:
                    {
                        System.out.println("Opção invalida! Tente novamente: ");
                        escolheLista();
                    }
            }

        }
    }
