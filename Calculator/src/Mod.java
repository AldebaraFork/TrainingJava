public class Mod extends Calcular{

    //CONSTRUTOR DO RESTO DA DIVISAO
    public Mod(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }


    //METODO PARA RECEBER O CALCULO
    @Override
    public double getCalculo(){
        return getPrimeiroNumero() % getSegundoNumero();
    }
}
