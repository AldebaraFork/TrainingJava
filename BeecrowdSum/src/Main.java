import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


      String Nome = ler.nextLine();

      double Salario = ler.nextDouble();

      double TotalVendas = ler.nextDouble();

      double porcentagem = 15.0 / 100.0;

      double ValorFinalVendas  = TotalVendas * porcentagem;

      double ResultadoFinal = Salario + ValorFinalVendas;

      System.out.println("TOTAL = " + ResultadoFinal);

    }
}