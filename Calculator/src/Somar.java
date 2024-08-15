import java.util.InputMismatchException;
import java.util.Scanner;

public class Somar extends Calcular{


    //CONSTRUTOR DA SOMA
    public Somar(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
        getCalculo();

    }

    @Override
    //METODO PARA SOMAR OS NUMEROS
    public double getCalculo(){
        return getPrimeiroNumero() + getSegundoNumero();
    }

    @Override
    public  void obterNumero(double primeiroNumero, double segundoNumero) {
            try {
                System.out.println("Digite o primeiro numero : ");
                primeiroNumero = ler.nextDouble();
                System.out.println("Digite o segundo numero para visualizar as operações");
                segundoNumero = ler.nextDouble();
                //ATRIBUI OS NUMEROS INSERIDOS PELO USUARIO
                setPrimeiroNumero(primeiroNumero);
                setSegundoNumero(segundoNumero);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                ler.nextLine();
            }
    }

}
