//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        Supervisor dudu = new Supervisor();

        dudu.setNome("");
        System.out.println(dudu.getNome());

        dudu.setSenha("");
        System.out.println(dudu.getSenha());

        dudu.setSalario(0);
        System.out.println("Bonificação: " + dudu.getBonificacao());
    }
}