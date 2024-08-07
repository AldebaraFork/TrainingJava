import java.util.Scanner;

public class Funcionario {

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);

    //PROPRIEDADES DE UM FUNCIONARIO
    private String nome;
    private double salario;
    private String cpf;


    //CONSTRUTOR
    public void Funcinonario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //METODOS GET SET NOME

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        nome = ler.nextLine();
        if(nome.isEmpty() || nome.isBlank()){
            System.out.println("Nome invalido tente novamente");
            System.exit(0);
        }else {
            this.nome = nome;
        }
    }

    //METODOS GET SET SALARIO
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        salario = ler.nextDouble();
        if (salario < 1400) {
            System.out.println("Salario invalido, no mínimo um salário mínimo por funcionario");
        }
    }
}
