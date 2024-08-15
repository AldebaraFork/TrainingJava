import java.util.InputMismatchException;

public class Subtracao extends Calcular{

   //CONSTRUTOR DA CLASSE SUBTRAÇÃO
    public Subtracao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);

    }

    @Override
    //GET PARA RETORNAR A SUBTRAÇÃO
    public double getCalculo(){
        return getPrimeiroNumero() - getSegundoNumero();
    }


    //OBTEM O VALOR DOS NUMEROS PARA REALIZAR O CALCULO USANDO O getCalculo
    @Override
    public  void obterNumero(double primeiroNumero, double segundoNumero) {
        try {
            //OBTEM OS NUMEROS DE ENTRADA PARA O USUARIO
            System.out.println("Digite o primeiro numero : ");
            primeiroNumero = ler.nextDouble();
            System.out.println("Digite o segundo numero :");
            segundoNumero = ler.nextDouble();
            //ATRIBUI OS NUMEROS INSERIDOS PELO USUARIO
            setPrimeiroNumero(primeiroNumero);
            setSegundoNumero(segundoNumero);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número.");
            obterNumero(0,0);
        }
    }
}
