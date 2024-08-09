public class Supervisor extends Funcionario{


    private String senha;

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        senha = ler.nextLine().toLowerCase();
        if ((senha.length() < 8) || senha.isEmpty() || senha.isBlank()){
            System.out.println("Insira uma senha com mais de 8 digitos ");
            System.exit(0);
        }else {
            System.out.println("Senha salva");
            this.senha = senha;
        }
    }

    public double getSalario(){
        return super.getSalario();
    }
    public void setSalario(double salario){
        salario = ler.nextDouble();
        if (salario < 3000){
            System.out.println("Supervisores recebem R$3000, insira um salário valido");
            System.exit(0);
        }else {
            super.setSalario(salario);
        }
    }
}
