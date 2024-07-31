import java.awt.geom.Area;
import java.util.Scanner;

public class MenuBanco {

    //INSTANCIA

    Scanner ler = new Scanner(System.in);
    public void MenuPrincipal(){

        System.out.println("Menu principal, o que deseja fazer?");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Lista de contas");
        System.out.println("3 - Excluir contas");
        System.out.println("4 - Área de transações");
        System.out.println("5 - Sair");
        byte escolhaMenu = ler.nextByte();
        switch(escolhaMenu){
            case 1:
                MenuContas();
                break;
            case 2:
                ListaContas();
                break;
            case 3:
                ExcluirConta();
                break;
            case 4:
                AreaTransferencia();
                break;
            case 5:
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
        System.out.println("4 - Sair");
    }
    public void ListaContas(){

    }
    public void ExcluirConta(){}

    public void AreaTransferencia(){}

}
