
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {

    //INSTANCIA DO SCANNER
    Scanner ler = new Scanner(System.in);

    //LISTA PARA SALVAR OS CLIENTES
    static ArrayList<Conta> contasClientes = new ArrayList<>();


    //PROPRIEDADES QUE TODA CONTA TEM
    private String Nome;
    private int Idade;
    private int NumeroConta;
    private String Email;


    //METODOS GET DAS PROPRIEDADES
    public String GetNome(){
        return this.Nome;
    }
    public int GetIdade(){
        return this.Idade;
    }
    public int GetNumeroConta(){
        return this.NumeroConta;
    }
    public String GetEmail(){
        return this.Email;
    }

    //METODOS SET DAS PROPRIEDADES, TODAS VALIDAM A INFORMAÇÃO E SAALVAM DIRETAMENTE NO METODO
    public void SetNome(String nome){
        try {
            System.out.println("Insira o nome completo: ");
            nome = ler.nextLine();
            if (nome.isBlank() || nome.isEmpty()) {
                System.out.println("Nome invalido! tente novamente");
                SetNome("");
            } else {
                System.out.println("Nome: " + nome + " ,salvo com sucesso!  ");
                this.Nome = nome;
            }
        }catch(Exception e) {
            System.out.println("Ocorreu o erro: " + e.getMessage() + " , tente novamente");
            SetNome("");
        }
    }
    public void SetIdade(int idade){
        try {
            System.out.println("Insira a idade: ");
            idade = ler.nextInt();
            if (idade < 18) {
                System.out.println("Idade invalido! tente novamente");
                SetIdade(0);
            } else {
                System.out.println("Idade salva com sucesso: " + idade + " anos");
                this.Idade = idade;
            }
        }catch(InputMismatchException e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " Tente inserir um numero!");
            SetIdade(0);
        }
    }
    public void SetEmail(String email){
        try {
            System.out.println("Insira o email: ");
            email = ler.next();
            //VERIFICA SE O EMAIL ESTA VAZIO
            if (email.isBlank() || email.isEmpty()) {
                System.out.println("Email invalido! tente novamente");
                SetEmail("");
            }//CASO O EMAIL CONTENHA @ E . salva
            else if (email.contains("@") && email.contains(".")) {
                System.out.println("Email : " + email + " , salvo com sucesso! ");
                this.Email = email;
            } else {
                System.out.println("Email invalido! tente novamente");
                SetEmail("");
            }
        }catch(Exception e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " Tente novamente");
            SetEmail("");
        }
    }
    public void SetNumeroConta(int numeroConta){
        try {
            System.out.println("Insira o numero de conta:");
            numeroConta = ler.nextInt();
            if (numeroConta <= 0) {
                System.out.println("Numero de conta invalido! tente novamente");
                SetNumeroConta(0);
            }else {
                System.out.println("Numero da conta: " + numeroConta + " , salvo com sucesso");
                this.NumeroConta = numeroConta;
            }
        }catch (InputMismatchException e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " Tente inserir um numero!");
            SetNumeroConta(0);
        }
    }


    //SALVA O USUARIO NA LISTA
    public void SalvarContas(){
        try {
            //VERIFICA CASO O USUARIO DESEJASALVAR O USUARIO OU NAO
            System.out.println("Deseja salvar esse cliente? S/N");
            String opcaoSalvar = ler.next();
            //CASO O USUARIO DESEJE SALVAR
            if (opcaoSalvar.contains("S") || opcaoSalvar.contains("s")) {

                System.out.println("===========================");
                //INSERIR AQUI PARA SALVAR
                System.out.println("Salvo com sucesso!");

            }//CASO O USUARIO DESEJE SALVAR
            else if (opcaoSalvar.contains("N") || opcaoSalvar.contains("n")) {
                System.out.println("Conta nao criada! Retornando ao menu");
                //INSERIR METODO PARA RETORNAR AO MENU

            } else {
                System.out.println("Opção invalida! Tente novamente");

            }
        }//VERIFICAÇÃO DE ERRO
        catch(InputMismatchException e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " Tente novamente");
            SalvarContas();
        }
    }

    public void visualizarContas() {
        System.out.println("----------------------------------");
        System.out.println("Lista de usuários:");

        if (contasClientes.isEmpty()) {
            System.out.println("Lista vazia! Tente cadastrar um usuário.");
        } else {
            for (Conta conta : contasClientes) {
                if (conta != null) { // Verifica se o elemento não é nulo
                    System.out.printf("Nome: %-20s Email: %-25s Número da conta: %-10d Idade: %d%n",
                            conta.GetNome(), conta.GetEmail(), conta.GetNumeroConta(), conta.GetIdade());
                } else {
                    System.out.println("Elemento nulo encontrado na lista.");
                }
            }
        }
    }
}
