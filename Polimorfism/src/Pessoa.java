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
    public void validaNome(String nome){
        System.out.println("Insira o nome: ");
        nome = ler.next();
        if(nome.isEmpty()){
            System.out.println("Nome invalido");
            System.exit(0);
        }else {
            setNome(nome);
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
        System.out.println("Digite o cpf: ");
        cpf = ler.next();
        if (cpf.length() != 11){
            System.out.println("CPF invalido");
            System.exit(0);
        }else {
            setCpf(cpf);
        }
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //GET SET IDADE
    public int getIdade() {
        return this.idade;
    }
    public void validaIdade(int idade) {
        System.out.println("Digite a idade ");
        idade = ler.nextInt();
        if(idade < 18){
            System.out.println("Idade invalido");
            System.exit(0);
        }else {
            setIdade(idade);
        }
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
