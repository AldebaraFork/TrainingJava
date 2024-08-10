public class Supervisor extends Funcionario{


    //INSTANCIAS
    private String senha;

    //METODOS PARA A SENHA
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        System.out.println("Insira a senha do funcionario");
        senha = ler.next();
        if ((senha.length() < 8) || senha.isEmpty() || senha.isBlank()){
            System.out.println("Insira uma senha com mais de 8 digitos ");
            System.exit(0);
        }else {
            System.out.println("Senha salva");
            this.senha = senha;
        }
    }

    //SALARIO SUPERVISOR

    public double getSalario(){
        return super.getSalario();
    }
    public void validaSalario(double salario){
        System.out.println("Insira o salario: ");
        salario = ler.nextDouble();
        if (salario != 3500){
            System.out.println("Salario invalido, supervisores recebem 3500");
            System.exit(0);
        }else {
            System.out.println("Salario valido");
            setSalario(salario);
        }
    }
    public void setSalario(double salario){
        super.setSalario(salario);
    }


    public double getBonificacao(){
        return super.getSalario() * 0.5;
    }
}
