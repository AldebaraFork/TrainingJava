public class Multiplicacao extends Calcular{


    //CONSTRUTOR DA MULTIPLICAÇÃO
    public Multiplicacao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }


    //OBTEM DIRETO O VALOR DA MULTIPLICAÇÃO UTILIZANDO O GET
    public double getCalculo() {
        return getPrimeiroNumero() * getSegundoNumero();
    }
}
