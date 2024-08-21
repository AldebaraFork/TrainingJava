import java.util.InputMismatchException;

public class Divisao extends Calcular{

    //CONSTRUTOR DA DIVISAO
    public Divisao(double primeiroNumero, double segundoNumero){
        super(primeiroNumero, segundoNumero);
    }
    @Override
    //OBTEM O RESULTADO DA CONTA DA DIVISAO
    public double getCalculo(){
        return getPrimeiroNumero() / getSegundoNumero();
    }

    //OBTEM O VALOR DOS NUMEROS, E CALCULA UTILIZANDO O getCalculo
    //REESCRITA DE METODO, POIS 0 NÃO É UM NUMERO DIVISIVEL 
    @Override
    public  void obterNumero(double primeiroNumero, double segundoNumero) {
        try {
            //OBTEM OS NUMEROS DE ENTRADA PARA O USUARIO
            System.out.println("Digite o primeiro numero : ");
            primeiroNumero = ler.nextDouble();
            System.out.println("Digite o segundo numero :");
            segundoNumero = ler.nextDouble();
            if (primeiroNumero == 0 || segundoNumero == 0) {
                System.out.println("Não é possivel dividir por 0, tente novamente");
                obterNumero(0,0);
            }else {
                //ATRIBUI OS NUMEROS INSERIDOS PELO USUARIO
                setPrimeiroNumero(primeiroNumero);
                setSegundoNumero(segundoNumero);

            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número.");

        }
    }
}
