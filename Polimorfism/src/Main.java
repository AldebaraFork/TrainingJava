//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Supervisor dudu = new Supervisor("", "", 0, "", "");

        System.out.println("NOME: " + dudu.getNome());
        System.out.println("EMAIL: " + dudu.getEmail());
        System.out.println("CPF: " + dudu.getCpf());
        System.out.println("IDADE: " + dudu.getIdade());
        System.out.println("SENHA: " + dudu.getSenha());
        System.out.println("SALARIO: " + dudu.getSalario());
        System.out.println("BONUS: " + dudu.getBonusSalario());
        System.out.println("SALARIO TOTAL: " + dudu.getSalarioComBonus());

    }
}