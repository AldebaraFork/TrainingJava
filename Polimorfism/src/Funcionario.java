import java.util.InputMismatchException;

public class Funcionario extends Cliente{


  //CONSTRUTOR DE UM FUNCIONARIO
  public Funcionario(String nome, String cpf, int idade, String email, String senha) {
    super(nome, cpf, idade, email, senha);
    validaSalario(salario);
  }

  //PROPRIEDADES DE UM FUNCIONARIO
   private double salario;


  //GET SET E VALIDAÇÃO DE SALARIO

  public double getSalario() {
    return this.salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
  //VALIDA O SALARIO DO FUNCIONARIO, TODO FUNCIONARIO RECEBE AO MENOS 1 SALARIO MINIMO
  public void validaSalario(double salario){
    try {
      System.out.println("Digite o salario");
      salario = ler.nextDouble();
      if (salario < 1400) {
        System.out.println("Todo funcionario deve receber ao menos 1 salário mínimo");

      }else {
        setSalario(salario);
      }
      //CASO O USUARIO COLOQUE ALGO ALEM DE UM NUMERO
    }catch(InputMismatchException e){
      System.out.println("Ocorreu o erro: " + e.getMessage() + " , tente novamente");
    }
  }
}
