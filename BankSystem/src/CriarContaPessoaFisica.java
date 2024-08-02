
import java.util.ArrayList;
import java.util.Scanner;

public class CriarContaPessoaFisica
{

    //INSTANCIA
  Scanner ler = new Scanner(System.in);
  Conta novaConta = new Conta();
  static ArrayList<CriarContaPessoaFisica> contasFisicas = new ArrayList<>();

  //PROPRIEDADES PARA SALVAR NA LISTA
    public String NOME ;
    public int AGENCIA;
    public double SALDO;
    public String CPF;





   //METODOS
  public void CriaContaFisica(){
      MenuBanco menu = new MenuBanco();
      try {

          //RECEBE OS DADOS DO USUARIO PARA CRIAÇÃO DA CONTA
          System.out.println("Digite seu nome completo: ");
          novaConta.nomeTitular = ler.nextLine().toUpperCase();
          if (novaConta.nomeTitular.isEmpty()) {
              System.out.println("Nome invalido!");
              CriaContaFisica();
          }
          System.out.println("Digite seu CPF: ");
          novaConta.cpf = ler.nextLine();
          if (novaConta.cpf.length() != 11) {
              System.out.println("CPF invalido!");
              CriaContaFisica();
          } else if (novaConta.cpf.isEmpty()){
              System.out.println("CPF invalido!");
              CriaContaFisica();
          }

          System.out.println("Digite a agencia: ");
          novaConta.agencia = ler.nextInt();
          if (novaConta.agencia <= 0) {
              System.out.println("Agencia invalida ");
          }

          //CONSTRUTOR PARA SALVAR NOVA CONTA FISICA
          CriarContaPessoaFisica contaFisica = new CriarContaPessoaFisica();
          contaFisica.NOME = novaConta.nomeTitular;
          contaFisica.CPF = novaConta.cpf;
          contaFisica.AGENCIA = novaConta.agencia;
          contaFisica.SALDO = novaConta.saldo;


          //ADICIONA O USUARIO A LSITA
          System.out.println("Conta criada com sucesso! " +
                  "Nome titular: " + novaConta.nomeTitular + " CPF: " + novaConta.cpf + " Agencia: " + novaConta.agencia + " Saldo: " + novaConta.saldo);
          contasFisicas.add(contaFisica);

          menu.MenuPrincipal();



      }catch(Exception ex ){
          System.out.println("Ocorreu o erro: " + ex.getMessage() + " Tente novamente ");
      }finally {
          ler.close();
      }

  }

  public void ListaContasFisicas(){
      MenuBanco menu = new MenuBanco();
     System.out.println("Contas cadastradas: ");
     if(contasFisicas.isEmpty()){
         System.out.println("lista vazia, Cadastre uma conta ");
     }else {
         for (CriarContaPessoaFisica contaFisica : contasFisicas) {
             System.out.println("----------------------------------");
             System.out.println("Nome: " + contaFisica.NOME);
             System.out.println("CPF: " + contaFisica.CPF);
             System.out.println("Agencia: " + contaFisica.AGENCIA);
             System.out.println("Saldo na conta: " + contaFisica.SALDO);
             System.out.println("-------------------------");
         }
     }
      menu.MenuPrincipal();

  }





}
