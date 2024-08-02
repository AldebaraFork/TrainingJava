import java.awt.geom.Area;
import java.util.Scanner;

public class MenuBanco {

    //INSTANCIA
    Scanner ler = new Scanner(System.in);
    CriarContaPessoaFisica ContaFisica = new CriarContaPessoaFisica();
    CriarContaJuridica ContaJuridica = new CriarContaJuridica();
    Transacoes transacoes = new Transacoes();



    public void MenuPrincipal(){

        System.out.println("Menu principal, o que deseja fazer?");
        System.out.println("1 - Gerenciar contas");
        System.out.println("2 - Lista de contas");
        System.out.println("3 - Área de transações");
        System.out.println("4 - Sair");
        byte escolhaMenu = ler.nextByte();
        switch(escolhaMenu){
            case 1:
                MenuContas();
                break;
            case 2:
                System.out.println("Qual lista? PJ ou fisica? ");
                var EscolhaListas = ler.next().toUpperCase();
                if (EscolhaListas.equals("PJ")){
                    ContaJuridica.VisualizarContasPJ();
                }else if (EscolhaListas.equals("FISICA")){
                    ContaFisica.ListaContasFisicas();
                }else {
                    System.out.println("Opção invalida");
                }
                break;
            case 3:
                MenuTransacoes();
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
        System.out.println("Menu de contas, o que deseja fazer?");
        System.out.println("1 - Cadastrar conta pessoa física");
        System.out.println("2 - Cadastrar conta jurídica");
        System.out.println("3 - Excluir conta fisica");
        System.out.println("4 - Excluir conta jurídica");
        System.out.println("5 - Voltar ao menu principal");
        byte EscolhaMenu = ler.nextByte();
        switch(EscolhaMenu){
            case 1:
                ContaFisica.CriaContaFisica();
                break;
            case 2:
                ContaJuridica.MetodoCriaContaJuridica();
                break;
            case 3:
                break;
            case 4:
                ContaJuridica.RemoverContasPJ();
                break;
            case 5:
                MenuPrincipal();
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;

        }

    }
    public void MenuTransacoes(){
        System.out.println("Menu de Transações");
        System.out.println("1 - Transferencia para conta fisica");
        System.out.println("2 - Transferencia para conta PJ");
        System.out.println("3 - Voltar ao menu principal");
        System.out.println("4 - Sair");
        short EscolhaTransacoes = ler.nextShort();
        switch(EscolhaTransacoes){
            case 1:
                transacoes.MetodoTransacoes();
                break;
            case 2:
                transacoes.MetodoTransacoes();
                break;
            case 3:
                RetornarMenu();
                break;
            case 4:
                System.exit(0);
                break;

        }
    }
    public void RetornarMenu(){
        MenuPrincipal();
    }

}
