public class Supervisor extends Funcionario{

    //CONSTRUTOR DE UM FUNCIONARIO
    public Supervisor(String nome, String cpf, int idade, String email, String senha) {
        super(nome, cpf, idade, email, senha);

    }

    //O SUPERVISOR POSSUI OS MESMOS ATRIBUTOS QUE UM FUNCIONARIO COMUM
    //MAS POSSUI BONIFICAÇÃO DE 15% NO SALÁRIO

    public double getBonusSalario(){
        return getSalario() * 0.15;
    }
    public double getSalarioComBonus(){
        return getSalario() + getBonusSalario();
    }

}
