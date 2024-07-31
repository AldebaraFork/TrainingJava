import java.awt.geom.Area;
import java.util.Scanner;

public class MenuBanco {

    //INSTANCIA
    Scanner ler = new Scanner(System.in);
    CriarContaPessoaFisica criaContaFisica = new CriarContaPessoaFisica();

    public void MenuPrincipal(){

        System.out.println("Menu principal, o que deseja fazer?");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Lista de contas");
        System.out.println("3 - Área de transações");
        System.out.println("4 - Sair");
        byte escolhaMenu = ler.nextByte();
        switch(escolhaMenu){
            case 1:
                MenuContas();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida! tente novamente");
                MenuPrincipal();
                break;
        }
    }
    public void MenuContas(){
        System.out.println("Menu contas");
        System.out.println("1 - Cadastrar conta pessoa física");
        System.out.println("2 - Cadastrar conta jurídica");
        System.out.println("3 - Lista de contas ");
        System.out.println("4 - Excluir contas");
        System.out.println("5 - Sair");
        System.out.println("6 - Voltar ao menu principal");
        byte EscolhaMenu = ler.nextByte();
        switch(EscolhaMenu){
            case 1:
                criaContaFisica.CriaContaFisica();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            case 6:
                MenuPrincipal();
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;

        }

    }

}
