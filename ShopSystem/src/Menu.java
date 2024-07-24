import java.util.Scanner;

public class Menu {
    //INSTANCIAS
    public static Scanner ler = new Scanner(System.in);


    static void MenuPrincipal() {

        System.out.print("\033[H\033[2J");
        //MENU PRINCIPAL ANTES DE IR AOS OUTROS MENUS
        System.out.println("Bem vindo ao menu principal! Digite o numero das opções abaixo");
        System.out.println("1 - Gerenciar clientes");
        System.out.println("2 - Gerenciar produtos");
        System.out.println("3 - Gerenciar funcionarios");
        System.out.println("0 - Sair");
        short OpcaoMenuPrincipal = ler.nextShort();
        switch (OpcaoMenuPrincipal) {

            //GERENCIA OS CLIENTES
            case 1:
                 MenuClientes();
                break;
            //GERENCIA OS PRODUTOS
            case 2:
                MenuProdutos();
                break;
            case 3:
                MenuFuncionarios();
                break;
            //SAI DO PROGRAMA
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                MenuPrincipal();
                break;
        }

    }

    static void MenuClientes() {
        GerenciarClientes gerenciar = new GerenciarClientes();
        System.out.print("\033[H\033[2J");
        System.out.println("Menu de gerenciamento de clientes! digite o numero das opções abaixo");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Remover cliente");
        System.out.println("3 - Ver clientes cadastrados");
        System.out.println("4 - Voltar ao menu principal");
        System.out.println("0 - Sair");
        short OpcaoMenuClientes = ler.nextShort();
        switch (OpcaoMenuClientes) {

            //ADICIONA CLIENTES
            case 1:
                gerenciar.CadastrarCliente();
                break;

            //REMOVE CLIENTES
            case 2:
                gerenciar.ExcluirClientes();
                break;

            //VISUALIZA CLIENTES CADASTRADOS
            case 3:
                gerenciar.VerClientes();
                break;
            //RETORNA AO MENU PRINCIPAL
            case 4:
                MenuPrincipal();
                break;

            //SAI DO APP
            case 0:
                System.exit(0);
                break;

            //OPÇÃO INVALIDA
            default:
                System.out.println("Opção invalida! Tente novamente");
                MenuPrincipal();
                break;

        }

    }

    static void MenuProdutos()
    {
        GerenciarProdutos gerencia = new GerenciarProdutos();
        System.out.print("\033[H\033[2J");
        System.out.println("Menu produtos! Digite o numero para as opções abaixo:");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Ver produtos");
        System.out.println("4 - Voltar ao menu principal");
        System.out.println("0 - Sair");
        short OpcaoProdutos = ler.nextShort();
        switch (OpcaoProdutos) {

            //ADICIONA PRODUTOS
            case 1:
                gerencia.CadastrarProduto();
                break;
            //REMOVE PRODUTOS
            case 2:
                gerencia.ExcluirProduto();
                break;
            //VER PRODUTOS
            case 3:
                gerencia.VisualizarProdutos();
                break;
            //VOLTAR AO MENU PRINCIPAL
            case 4:
                RetornarMenuPrincipal();
                break;
            //SAIR
            case 0:
                MenuPrincipal();
                break;
            //OPÇÃO INVALIDA
            default:
                System.exit(0);
                break;


        }
    }

    static void MenuFuncionarios(){
        GerenciarFuncionarios gerencia = new GerenciarFuncionarios();
        System.out.print("\033[H\033[2J");
        System.out.println("Bem vindo ao menu de funcionarios! Escolha uma opção abaixo");
        System.out.println("1 - Cadastrar funcionario");
        System.out.println("2 - Ver funcionario");
        System.out.println("3 - Excluir funcionarios");
        System.out.println("4 - Voltar ao menu principal");
        System.out.println("0 - Sair");
        byte EscolhaFuncionario = ler.nextByte();
        switch (EscolhaFuncionario) {
            case 1:
                gerencia.CadastrarFuncionario();
                break;
            case 2:
                gerencia.VerFuncionarios();
                break;
            case 3:
                gerencia.ExcluirFuncionario();
                break;
            case 4:
                RetornarMenuPrincipal();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida! Tente novamente");
                MenuFuncionarios();

                break;

        }
    }

    static void RetornarMenuPrincipal(){
        MenuPrincipal();
    }


}
