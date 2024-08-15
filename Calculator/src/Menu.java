import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //TODAS AS INTANCIAS PARA ACESSAR OS METODOS
    Scanner ler = new Scanner(System.in);


    //MENU PRINCIPAL
    public void MenuPrincipal(){
        //UTILIZANDO O TRY E LINDANDO COM EXCEPTIONS
        try {
            //O USUARIO INSERE UM NUMERO E VAI AO CALCULO DESEJADO
            System.out.println("Bem vindo ao menu principal! Selecione uma opção abaixo: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            short opcaoMenu = ler.nextShort();
            switch (opcaoMenu) {
                case 1:
                    Somar soma = new Somar(0,0);
                    soma.obterNumero(0,0);
                    System.out.println("Resultado da soma: " + soma.getCalculo());
                    break;
                case 2:
                    Subtracao menos = new Subtracao(0,0);
                    menos.obterNumero(0,0);
                    System.out.println("Resultado da subtração: " + menos.getCalculo());
                    break;
                case 3:
                    Multiplicacao vezes = new Multiplicacao(0,0);
                    vezes.obterNumero(0,0);
                    System.out.println("Resultado da multiplicacao: " + vezes.getCalculo());
                    break;
                case 4:
                    Divisao divisao = new Divisao(0,0);
                    divisao.obterNumero(0,0);
                    System.out.println("Resultado da divisão: " + divisao.getCalculo());
                    break;
                case 0:
                    System.out.println("Saindo do app....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Insira um numero valido! Tente novamente ");
                    MenuPrincipal();
                    break;
            }
        }catch(InputMismatchException exception){
            //LIDA COM ERRO DE CASO O USUARIO NÃO INSIRA UM NUMERO
            System.out.println("Ocorreu o erro: " +exception.getMessage() + " Tente novamente! ");
            MenuPrincipal();
        }
    }
}
