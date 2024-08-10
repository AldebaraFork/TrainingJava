//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente theo = new Cliente("", "", 0, "", "");

        System.out.println("NOME: " + theo.getNome());
        System.out.println("EMAIL: " + theo.getEmail());
        System.out.println("CPF: " + theo.getCpf());
        System.out.println("IDADE: " + theo.getIdade());
        System.out.println("SENHA: " + theo.getSenha());


    }
}