//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("");
        System.out.println(gerente.getNome());

        gerente.setCpf("");
        System.out.println(gerente.getCpf());

        gerente.validaSalario(0);
        System.out.println(gerente.getSalario());

        gerente.setSenha("");
       System.out.println(gerente.getSenha());

        System.out.println("total bonificação: " + gerente.getBonificacao());
    }
}