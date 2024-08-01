import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CriarContaPessoaFisica
{

    //INSTANCIA
  Scanner ler = new Scanner(System.in);
  Conta novaConta = new Conta();

  ArrayList<Conta> contas = new ArrayList<Conta>();



   //METODOS
  public void CriaContaFisica(){
      try {
          System.out.println("Digite seu nome completo: ");
          novaConta.nomeTitular = ler.nextLine().toUpperCase();
          if (novaConta.nomeTitular.isEmpty()) {
              System.out.println("Nome invalido!");
          }
          System.out.println("Digite seu CPF: ");
          novaConta.cpf = ler.nextLine();
          if (novaConta.cpf.length() < 11) {
              System.out.println("CPF invalido!");
          }

          System.out.println("Digite a agencia: ");
          novaConta.agencia = ler.nextInt();
          if (novaConta.agencia <= 0) {
              System.out.println("Agencia invalida ");
          }

          System.out.println("Conta criada com sucesso! ");

          contas.add(novaConta);
      }catch(Exception ex ){
          System.out.println("Ocorreu o erro: " + ex.getMessage() + " Tente novamente ");
      }finally {
          ler.close();
      }

  }





}
