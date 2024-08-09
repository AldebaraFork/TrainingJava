public class Supervisor extends Funcionario{


    //INSTANCIAS
    private String senha;

    //SENHA
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        System.out.println("Insira a senha do funcionario");
        senha = ler.nextLine();
        if ((senha.length() < 8) || senha.isEmpty() || senha.isBlank()){
            System.out.println("Insira uma senha com mais de 8 digitos ");
            System.exit(0);
        }else {
            System.out.println("Senha salva");
            this.senha = senha;
        }
    }

    //SALARIO SUPERVISOR

    public void setSalario(double salario){
        System.out.println("Insira o salario do supervisor");
        salario = ler.nextDouble();

        if (salario < 3000){
            System.out.println("Supervisores recebem R$3000, insira um salário valido");
            System.exit(0);
        }else{
            super.setSalario(salario);
        }
    }
    public double getBonificacao(){
        return super.getSalario() * 0.1;
    }
}
