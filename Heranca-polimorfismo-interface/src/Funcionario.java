import java.util.Scanner;

public class Funcionario {

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);

    //PROPRIEDADES DE UM FUNCIONARIO
    private String nome;
    private double salario;
    private String cpf;




    //METODOS GET SET NOME
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        System.out.println("Insira o nome do funcionario");
        nome = ler.nextLine();
        if(nome.isEmpty() || nome.isBlank()){
            System.out.println("Nome invalido tente novamente");
            System.exit(0);
        }else {
            this.nome = nome;
            System.out.println("Nome salvo com sucesso");
        }
    }

    //METODOS GET SET SALARIO
    public double getSalario() {
        return this.salario;
    }
    public void validaSalario(double salario){
        System.out.println("Insira o salario do funcionario");
        salario = ler.nextDouble();
        if (salario <= 1400)
        {
            System.out.println("Salario invalido");
            System.exit(0);

        }else {
            setSalario(salario);
        }
    }
    public void setSalario(double salario) {
        this.salario = salario;

    }
    public double getBonificacao(){
        return this.salario * 0.15;
    }

    //METODOS GET SET CPF
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        System.out.println("Insira o cpf do funcionario");
        cpf = ler.nextLine();
        if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
            System.out.println("CPF invalido tente novamente");
            System.exit(0);
        }else {
            this.cpf = cpf;
            System.out.println("CPF salvo com sucesso");
        }
    }
}
