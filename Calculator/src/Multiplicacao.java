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

    //OBTEM OS VALOR DOS NUMEROS PARA REALIZAR A OPERAÇÃO UTILIZANDO getCalculo
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
