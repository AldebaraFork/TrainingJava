import java.util.InputMismatchException;

public class Multiplicacao extends Calcular{


    //CONSTRUTOR DA MULTIPLICAÇÃO
    public Multiplicacao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }

@Override
    //OBTEM DIRETO O VALOR DA MULTIPLICAÇÃO UTILIZANDO O GET
    public double getCalculo() {
        return getPrimeiroNumero() * getSegundoNumero();
    }


}
