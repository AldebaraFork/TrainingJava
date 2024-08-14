public class Subtracao extends Calcular{

   //CONSTRUTOR DA CLASSE SUBTRAÇÃO
    public Subtracao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);

    }

    //GET PARA RETORNAR A SUBTRAÇÃO
    public double getCalculo(){
        return getPrimeiroNumero() - getSegundoNumero();
    }

}
