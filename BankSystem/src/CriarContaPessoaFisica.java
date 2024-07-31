import java.util.Scanner;

public class CriarContaPessoaFisica
{

    //INSTANCIA
  Scanner ler = new Scanner(System.in);
  Conta novaConta = new Conta();



   //METODOS
  public void CriaContaFisica(){
      System.out.println("Digite seu nome completo: ");
      novaConta.nomeTitular = ler.nextLine().toUpperCase();
      if (novaConta.nomeTitular.isEmpty()){
          System.out.println("");
      }

      System.out.println("Digite seu CPF: ");
      novaConta.cpf = ler.nextLine();

      System.out.println("Digite a agencia: ");
      novaConta.agencia = ler.nextInt();
  }





}
