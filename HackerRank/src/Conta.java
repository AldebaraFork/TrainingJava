import java.util.Scanner;

public class Conta {

    //PROPRIEDADES
    private String nomeConta;
    private String senhaUsuario;
    private String emailUsuario;

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);

    //SETTERS E GETTERS UNIVERSAIS DE TODA CONTA
    public String getNomeConta() {
        return nomeConta;
    }

    //SETA O NOME DE USUARIO, ATRIBUINDO E TRATANDO ERROS
    public void SetNomeConta(String nomeUsuario) {

        try {
            System.out.println("Insira o nome do usuario");
            nomeUsuario = ler.nextLine();
            //VALIDA SE O NOME DE USUARIO ESTÁ VAZIO
            if (nomeUsuario.isEmpty()) {
                System.out.println("Ocorreu um erro, insira um valor valido");
                System.exit(0);
            }
            //SE O NOME ESTIVER VALIDO
            this.nomeConta = nomeUsuario;
        }catch(Exception ex) {
            System.out.println("Ocorreu o erro: " + ex.getMessage() + " Tente novamente");
        }finally{
            //EVITA O VAZAMENTO DE DADOS
            ler.close();
        }
    }

    //SENHAS DO USUARIO, TODAS AS SENHAS DEVEM CONTEM AO MENOS 8 CARACTERES
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void SetSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    
    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void SetEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

}
