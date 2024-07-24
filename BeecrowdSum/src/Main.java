
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        short CodigoPecas = ler.nextShort();
        int NumeroPecas = ler.nextInt();
        double PrecoPecas = ler.nextDouble();

        short SegundoCodigoPecas = ler.nextShort();
        int SegundoNumeroPecas = ler.nextInt();
        double SegundoPrecoPecas = ler.nextDouble();


        double ValorPrimeirasPecas = NumeroPecas * PrecoPecas;
        double ValorSegundaPecas = SegundoNumeroPecas * SegundoPrecoPecas;

        double ValorTotal = ValorPrimeirasPecas + ValorSegundaPecas;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ValorTotal);

    }
}