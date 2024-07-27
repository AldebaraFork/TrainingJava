import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {



        //SISTEMA DE FESTA

        //PROPRIEDADES
        String nome;
        int idade;
        boolean acompanhado;


        //SISTEMA
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        if (nome.isEmpty()){
            System.out.println("Insira um valor valido");
        }


        //VERIFICA A IDADE E ACOMPANHAMENTO
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Você está acompanhado? ");
        String verificar = ler.nextLine().toUpperCase();
        if (verificar.isEmpty()){
            System.out.println("Insira um valor valido");
        }else if (verificar.equals("SIM") || verificar.equals("S")){
            acompanhado = true;

            //CASO O USUARIO SEJA DE MENOR MAS ESTEJA ACOMPANHADO
            if (idade < 18 || acompanhado == true){
                System.out.println("Bem vindo");
            }
            //SE FOR DE MAIOR
            if (idade >= 18 ){
                System.out.println("Bem vindo");
            }
        }





    }

}