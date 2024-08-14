import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcular {

    //ESSA CLASSE SERA USADA PARA CALCULAR
    //TENDO METODOS QUE FUNCIONARÃO PARA TODOS AS OPERAÇÕES

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);

    //PROPRIEDADES DA SOMA
    private double primeiroNumero;
    private double segundoNumero;

    //CONSTRUTOR, TODAS AS CLASSES DE SOMA NECESSITÃO A ENTRADA DE DOIS NUMEROS
    public Calcular(double primeiroNumero, double segundoNumero){
        ValidaPrimeiroNumero( primeiroNumero);
        ValidaSegundoNumero( segundoNumero);

    }

    ///METODOS DO PRIMEIRO NUMERO

    //METODOS PARA RETORNAR OS NUMEROS
    public double getPrimeiroNumero() {
        return this.primeiroNumero;
    }
    //METODOS PARA SETAR OS NUMEROS PARA O CALCULO
    public void SetPrimeiroNumero(double primeiroNumero){
       this.primeiroNumero = primeiroNumero;
    }
    //VALIDA O PRIMEIRO NUMERO UTILIZANDO O SET
    public void ValidaPrimeiroNumero(double primeiroNumero){
        try {
            //AQUI O USUARIO INSERE O VALOR DO PRIMEIRO NUMERO PARA O CALCULO
            System.out.println("Digite o primeiro numero: ");
            primeiroNumero = ler.nextDouble();
            SetPrimeiroNumero(primeiroNumero);
        }catch(InputMismatchException e){
            System.out.println("Ocorreu um erro: " + e.getMessage() + ", Insira um numero");
        }
    }

    //METODOS PARA O SEGUNDO NUMERO

    //GET SET SEGUNDO NUMERO
    public double getSegundoNumero() {
        return this.segundoNumero;
    }
    public void setSegundoNumero(double segundoNumero){
        this.segundoNumero = segundoNumero;
    }
    //VALIDA O SEGUNDO NUMERO UTILIZANDO O SET
    public void ValidaSegundoNumero(double segundoNumero){
        try {
            //O USUARIO INSERE O VALOR DO SEGUNDO NUMERO PARA CALCULO
            System.out.println("Digite o primeiro numero: ");
            segundoNumero = ler.nextDouble();
            setSegundoNumero(segundoNumero);
        }catch(InputMismatchException e){
            System.out.println("Ocorreu um erro: " + e.getMessage() + ", Insira um numero");
        }
    }

    //METODO PARA CALCULOS GLOBAL
    public double getCalculo(){
        return primeiroNumero - segundoNumero;
    }
}
