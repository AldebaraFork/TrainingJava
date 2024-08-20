public class Porcentagem extends Calcular{

    public Porcentagem(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }

    @Override
    public double getCalculo() {
        return getPrimeiroNumero() - getSegundoNumero();
    }
}
