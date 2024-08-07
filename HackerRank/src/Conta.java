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

    //VALIDA O NOME DO USUARIO
    public void SetNomeConta(String nomeUsuario) {

        //SETA O NOME DE USUARIO, ATRIBUINDO E TRATANDO ERROS
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
        }
    }

    //SENHAS DO USUARIO, TODAS AS SENHAS DEVEM CONTEM AO MENOS 8 CARACTERES
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void SetSenhaUsuario(String senhaUsuario) {

        System.out.println("Insira a senha do usuario: ");
        senhaUsuario = ler.nextLine();
        //VALIDA A SENHA DO USUARIO
        try {
            if (senhaUsuario.length() < 8 ) {
                System.out.println("A senha precisa conter no minimo 9 caracteres! Tente novamente");
                System.exit(0);
            }else {
                //SE A SENHA ESTIVER CORRETA ELA SALVA
                this.senhaUsuario = senhaUsuario;
            }
        }catch(Exception ex) {
            //TRATAMENTO DE ERRO
            System.out.println("Ocorreu um erro: " + ex.getMessage() + " Tente novamente");
        }
    }


    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void SetEmailUsuario(String emailUsuario) {
        try {
            System.out.println("Insira o email do usuario: ");
            emailUsuario = ler.nextLine();
            //CASO O EMAIL ESTEJA VAZIO NÃO É POSSIVEL CONTINUAR
            if (emailUsuario.contains("@")){
                System.out.println("Email validado com sucesso! ");
                this.emailUsuario = emailUsuario;
            }else if (emailUsuario.isEmpty()){
                System.out.println("Digite um email valido");
                System.exit(0);
            }else {
                System.out.println("Insira um email valido");
                System.exit(0);
            }

        }catch(Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
        }
    }

}
