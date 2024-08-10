public class Cliente extends Pessoa{

//CONSTRUTOR DE UM CLIENTE
    public Cliente(String nome, String cpf, int idade, String email, String senha) {
        super(nome, cpf, idade);
        validaEmail("");
        validaSenha("");
    }

    //PROPRIEDADES DE UM CLIENTE
    private String email;
    private String senha;


    //GET SET EMAILS
    public String getEmail() {
      return this.email;
    }
    public void validaEmail(String email){
        System.out.println("Digite o email: ");
        email = ler.next();
        //VALIDAÇÃO BEM SUCEDIDA
        if (email.contains("@")){
            setEmail(email);
        }
        //EMAIL INVALIDO
        else {
            System.out.println("Email invalido! ");
            System.exit(0);
        }
    }
    public void setEmail(String email){
        this.email = email;
    }

    //GET SET SENHA
    public String getSenha() {
        return this.senha;
    }
    public void validaSenha(String senha){
        System.out.println("Digite a senha, elas precisam de ao menos 8 caracteres: ");
        senha = ler.next();
        if (senha.length() < 8){
            System.out.println("Senha invalida! ");
            System.exit(0);
        }else {
            setSenha(senha);
        }
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
