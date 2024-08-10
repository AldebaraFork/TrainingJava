import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {

    //PROPRIEDADES
    private String nome;
    private String cpf;
    private int idade;

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);

   //CONSTRUTOR
    public Pessoa(String nome, String cpf, int idade) {
        validaNome(nome);
        validaCpf(cpf);
        validaIdade(idade);
    }


    //GET SET NOME
    public String getNome() {
        return this.nome;
    }

    //VALIDA O NOME DO USUARIO, MAIS IMPLEMENTAÇÕES EM BREVE
    public void validaNome(String nome){
        try {
            System.out.println("Insira o nome: ");
            nome = ler.nextLine();
            if (nome.isEmpty() ) {
                System.out.println("Nome invalido");

            } else {
                setNome(nome);
            }
        }catch(InputMismatchException e ){
            System.out.println("Ocorreu um erro: " + e.getMessage() + " , tente novamente");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //GET SET CPF
    public String getCpf() {
        return this.cpf;
    }
    public void validaCpf(String cpf){
        try {
            System.out.println("Digite o cpf: ");
            cpf = ler.next();
            if (cpf.length() != 11) {
                System.out.println("CPF invalido");
                System.exit(0);
            } else {
                setCpf(cpf);
            }
        }catch(Exception ex){
            System.out.println("Ocorreu um erro: " + ex.getMessage() + " , tente novamente");
        }
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //GET SET IDADE
    public int getIdade() {
        return this.idade;
    }
    //VALIDA A IDADE DO USUARIO, APENAS USUARIOS QUE FOREM
    // MAIORES DE 18 ANOS PODEM PROSSEGUIR
    public void validaIdade(int idade) {
        try {
            System.out.println("Digite a idade ");
            idade = ler.nextInt();
            if (idade < 18) {
                System.out.println("Idade invalido");
                System.exit(0);
            } else {
                setIdade(idade);
            }
        }catch (InputMismatchException ex){
            System.out.println("Ocorreu um erro: " + ex.getMessage() + " , tente novamente");
        }
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
