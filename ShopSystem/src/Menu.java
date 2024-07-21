import java.util.Scanner;

public class Menu {
    //INSTANCIAS
    public static Scanner ler = new Scanner(System.in);
    static GerenciarClientes gerenciar = new GerenciarClientes();

    static void MenuPrincipal() {

        System.out.print("\033[H\033[2J");
        //MENU PRINCIPAL ANTES DE IR AOS OUTROS MENUS
        System.out.println("Bem vindo ao menu principal! Digite o numero das opções abaixo");
        System.out.println("1 - Gerenciar clientes");
        System.out.println("2 - Gerenciar produtos");
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
                gerencia.VisualizarProdutos();
                break;
            //VER PRODUTOS
            case 3:
                break;
            //VOLTAR AO MENU PRINCIPAL
            case 4:
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

    static void RetornarMenuPrincipal(){
        MenuPrincipal();
    }


}
