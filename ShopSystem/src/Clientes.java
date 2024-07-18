import java.util.Scanner;

public class Clientes {
    public static Scanner ler = new Scanner(System.in);
    protected String Nome;
    protected short Idade;
    protected String Email;


    public void CadastrarCliente(){
        System.out.print("\033[H\033[2J");

        //VALIDA O NOME DO CLIENTE
        System.out.println("Digite o nome do cliente:");
        Nome = ler.nextLine();
        if (Nome.isEmpty()){
            System.out.println("Nome invalido tente novamente");
            CadastrarCliente();
        }
        //VALIDA A IDADE DO USUARIO
        System.out.println("Digite a idade do cliente");
        Idade = ler.nextShort();
        if (Idade < 18){
            System.out.println("Idade invalido tente novamente");
            CadastrarCliente();
        }
        //VALIDA O EMAIL DO USUARIO
        System.out.println("");


    }
}
