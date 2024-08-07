import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //INSTANCIAS
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente("41291732861", "532025933");

        System.out.println("cpf: " + cliente.getCpf());
        System.out.println("rg: " + cliente.getRg());


    }
}