public class Divisao extends Calcular{

    //CONSTRUTOR DA DIVISAO
    public Divisao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }
    //OBTEM O RESULTADO DA CONTA DA DIVISAO
    public double getCalculo(){
        return getPrimeiroNumero() / getSegundoNumero();
    }
}
