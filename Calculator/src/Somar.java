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


}
