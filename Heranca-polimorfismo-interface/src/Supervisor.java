public class Supervisor extends Funcionario{


    private String senha;

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        senha = ler.nextLine().toLowerCase();
        if (senha.length() < 8){
            System.out.println("Insira uma senha com mais de 8 digitos ");
        }
    }

}
