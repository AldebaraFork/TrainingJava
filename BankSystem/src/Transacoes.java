
import java.util.Scanner;

public class Transacoes extends Conta {

    Scanner ler = new Scanner(System.in);



   public void MetodoTransacoes(){
       System.out.println("Qual transação deseja fazer? Opções disponiveis: ");
       System.out.println("Saque, Depósito, Transferência ");
       String EscolhaTransacao = ler.nextLine().toUpperCase();
       if(EscolhaTransacao.equals("SAQUE")){
           Saque(ler.nextDouble());
       }else if (EscolhaTransacao.equals("DEPOSITO")){
           Depositar(ler.nextDouble());
       }else if (EscolhaTransacao.equals("TRANSFERENCIA")){
           Transferir(ler.nextDouble(),ler.nextLine());
       }else{
           System.out.println("Opção invalida, tente novamente");
           MetodoTransacoes();
       }
   }

}
