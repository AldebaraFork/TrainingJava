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
            System.out.println("5 - Resto da Divisão");
            System.out.println("6 - Menu de porcentagem");
            System.out.println("0 - Sair");
            short opcaoMenu = ler.nextShort();
            switch (opcaoMenu) {
                case 1:
                    Calcular soma = new Somar(0,0);
                    soma.obterNumero(0,0);
                    System.out.println("Resultado da soma: " + soma.getCalculo());
                    MenuPrincipal();

                    break;
                case 2:
                    Calcular menos = new Subtracao(0,0);
                    menos.obterNumero(0,0);
                    System.out.println("Resultado da subtração: " + menos.getCalculo());
                    MenuPrincipal();
                    break;
                case 3:
                    Calcular vezes = new Multiplicacao(0,0);
                    vezes.obterNumero(0,0);
                    System.out.println("Resultado da multiplicacao: " + vezes.getCalculo());
                    MenuPrincipal();
                    break;
                case 4:
                    Calcular divisao = new Divisao(0,0);
                    divisao.obterNumero(0,0);
                    System.out.println("Resultado da divisão: " + divisao.getCalculo());
                    MenuPrincipal();
                    break;
                case 5:
                    Calcular mod = new Mod(0,0);
                    mod.obterNumero(0,0);
                    System.out.println("Resultado do resto da divisão: " + mod.getCalculo());
                    MenuPrincipal();
                    break;
                case 6:
                    MenuPorcentagem();
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
            MenuPrincipal();
        }catch(InputMismatchException exception){
            //LIDA COM ERRO DE CASO O USUARIO NÃO INSIRA UM NUMERO
            System.out.println("Ocorreu o erro: " +exception.getMessage() + " Tente novamente! ");
            MenuPrincipal();
        }
    }
    public void MenuPorcentagem(){
        System.out.println("Escolha uma opção abaixo, em seguida insira o numero que deseja saber a porcentagem ");
        System.out.println("1 - Somar porcentagem");
        System.out.println("2 - Subtrair porcentagem");
        System.out.println("3 - Retornar ao menu Principal");
        System.out.println("4 - Sair");
        short opcaoMenu = ler.nextShort();
        switch(opcaoMenu){
            case 1:
                SomarPorcentagem somarPorcentagem = new SomarPorcentagem(0,0);
                somarPorcentagem.obterNumero(0,0);
                System.out.println("Resultado com a porcentagem: " + somarPorcentagem.getCalculo());
                MenuPrincipal();
                break;
            case 2:
                Porcentagem porcento = new Porcentagem(0,0);
                porcento.obterNumero(0,0);
                porcento.getCalculo();
                System.out.println("Resultado da subtração da porcentagem: " + porcento.getCalculo());
                MenuPrincipal();
                break;
            case 3:
                MenuPrincipal();
                break;
            case 4:
                System.out.println("Saindo do app....");
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida! Tente novamente");
                MenuPorcentagem();
                break;
        }
    }
}
