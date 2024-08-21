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
    public Calcular(double primeiroNumero, double segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
}

        ///METODOS DO PRIMEIRO NUMERO

    //METODOS PARA RETORNAR OS NUMEROS
    public double getPrimeiroNumero() {
        return this.primeiroNumero;
    }
    //METODOS PARA SETAR OS NUMEROS PARA O CALCULO
    public void setPrimeiroNumero(double primeiroNumero){
       this.primeiroNumero = primeiroNumero;
    }


    //METODOS PARA O SEGUNDO NUMERO
    //GET SET SEGUNDO NUMERO
    public double getSegundoNumero() {
        return this.segundoNumero;
    }
    public void setSegundoNumero(double segundoNumero){
        this.segundoNumero = segundoNumero;
    }

    //METODO PARA OBTER OS NUMEROS
    public  void obterNumero(double primeiroNumero, double segundoNumero) {
            try {
                //OBTEM OS NUMEROS DE ENTRADA PARA O USUARIO
                System.out.println("Digite o primeiro numero : ");
                primeiroNumero = ler.nextDouble();
                System.out.println("Digite o segundo numero para completar a operação");
                segundoNumero = ler.nextDouble();
                //ATRIBUI OS NUMEROS INSERIDOS PELO USUARIO
                setPrimeiroNumero(primeiroNumero);
                setSegundoNumero(segundoNumero);

            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número.");

            }
    }

    //METODO PARA CALCULOS GLOBAL
    public double getCalculo(){
        return primeiroNumero - segundoNumero;
    }
}
