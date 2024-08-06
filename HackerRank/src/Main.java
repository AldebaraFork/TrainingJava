import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //INSTANCIAS
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();


        conta.SetNomeConta(null);
        

        System.out.println(conta.getNomeConta());
    }
}