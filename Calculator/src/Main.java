//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Somar soma = new Somar(0,0);
        System.out.println("RESULTADO: " + soma.getCalculo());

        Subtracao menos = new Subtracao(0,0);
        System.out.println("Resultado: " + menos.getCalculo());
    }
}