public class SomarPorcentagem extends Calcular{

    //CONSTRUTOR DA PORCENTAGEM
    public SomarPorcentagem(double primeiroNumero, double segundoNumero) {
        super(primeiroNumero, segundoNumero);
    }



    //O USUARIO PRECISA COLOCAR EM FRAÇÃO A PORCENTAGEM QUE DESEJA FAZER
    @Override
    public double getCalculo(){
        return getPrimeiroNumero() * getSegundoNumero();
    }

}
