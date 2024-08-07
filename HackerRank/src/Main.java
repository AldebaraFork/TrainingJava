import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //INSTANCIAS
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();


       //INICIO DO PROGRAMA
        System.out.println("Testando os metodos get e sets");



        conta.SetNomeConta("");
        conta.SetEmailUsuario("");
        conta.SetSenhaUsuario("");


        System.out.println("Dados cadastrados, nome do usuario: " + conta.getNomeConta() + " email: " + conta.getEmailUsuario() + " senha: " + conta.getSenhaUsuario());
    }
}