import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //INSTANCIAS
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        //SET É USADO PARA OBTER OS DADOS, SEM INTERFERIR NA PROPRIEDADE NOME


        //SET PARA ATRIBUIR UM NOME AO NOME DO CLIENTE
        cliente.setNome(ler.nextLine());


        //ATRIBUIU O MESMO NOME PARA O NOME DE USUARIO DA CONTA
        conta.SetNomeUsuario(cliente.getNome());


        //IMPRIME AMBOS OS VALORES, POSSUEM O MESMO NOME
        System.out.println(cliente.getNome());
        System.out.println(conta.getNomeUsuario());



        //SET DENOVO PARA ALTERAR O NOME DO CLIENTE
        cliente.setNome("dudu");



        System.out.println("NOVOS NOMES:");
        System.out.println(cliente.getNome());
        System.out.println(conta.getNomeUsuario());


        

    }
}