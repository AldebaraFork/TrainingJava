import java.util.Scanner;

public class Conta {

    //INSTANCIA DO SCANNER
    Scanner ler = new Scanner(System.in);


    //PROPRIEDADES QUE TODA CONTA TEM
    private String Nome;
    private int Idade;
    private String NumeroConta;
    private String Email;

    //CONSTRUTOR QUE TODA CONTA PRECISARÁ INSERIR
    public Conta(String nome, String email, String numeroConta ){

    }

    //METODOS GET DAS PROPRIEDADES
    public String GetNome(){
        return this.Nome;
    }
    public int GetIdade(){
        return this.Idade;
    }
    public String GetNumeroConta(){
        return this.NumeroConta;
    }
    public String GetEmail(){
        return this.Email;
    }

    //METODOS SET DAS PROPRIEDADES
    public void SetNome(String nome){
        System.out.println("Insira o nome: ");
        nome = ler.nextLine();
        if (nome.isBlank() || nome.isEmpty()){
            System.out.println("Nome invalido! tente novamente");
            SetNome("");
        }else {
            System.out.println("Nome: " + nome +  " ,salvo com sucesso!  ");
            this.Nome = nome;
        }
    }
    
}
