import java.util.Scanner;
public class Menu {
    
    public  void MenuPrincipal(){
        Scanner ler = new Scanner(System.in);
        DadosPessoa pessoa = new DadosPessoa();
        System.out.println("Bem vindo ao menu principal! Selecione uma opção abaixo");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Ver clientes cadastrados");
        System.out.println("3 - Excluir clientes");
        System.out.println("0 - sair");
        short opcao = ler.nextShort();
        switch (opcao){
            case 1 :
                pessoa.CadastrarCliente();                   
                break;
            case 2:
    
                break;
            case 3:
    
                break;
            case 0:
               System.exit(1);
                break;
            default:
                break;
        }
 }
        
}
