
import java.util.Scanner;

public class Transacoes extends Conta {

    Scanner ler = new Scanner(System.in);

    public void MetodoTransacoes(){
        //INSTANCIA
        MenuBanco menu = new MenuBanco();


       System.out.println("Qual transação deseja fazer? Opções disponiveis: ");
       System.out.println("Saque, Deposito, Transferência ");
       String EscolhaTransacao = ler.next().toUpperCase();
       //VALIDA OS SAQUES
       if(EscolhaTransacao.equals("SAQUE")){
           Saque(ler.nextDouble());
       }else if (EscolhaTransacao.equals("DEPOSITO")){
           System.out.println("qual o valor do deposito? ");
           Depositar(ler.nextDouble());
           menu.RetornarMenu();
       }else if (EscolhaTransacao.equals("TRANSFERENCIA")){
           Transferir(ler.nextDouble(),ler.nextLine());
           menu.RetornarMenu();
       }else{
           System.out.println("Opção invalida, tente novamente");
           MetodoTransacoes();
       }
   }

}
