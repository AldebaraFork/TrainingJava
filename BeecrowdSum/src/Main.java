
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int PrimeiroNumero = ler.nextInt();
        int SegundoNumero = ler.nextInt();
        int TerceiroNumero = ler.nextInt();
        if (PrimeiroNumero > SegundoNumero || SegundoNumero > TerceiroNumero ) {
            System.out.println(PrimeiroNumero + " eh o maior");
        }else if (SegundoNumero > PrimeiroNumero || SegundoNumero > TerceiroNumero) {
            System.out.println(SegundoNumero + " eh o maior");
        }else if (TerceiroNumero > PrimeiroNumero || TerceiroNumero > SegundoNumero) {
            System.out.println(TerceiroNumero + " eh o maior");
        }


    }
}