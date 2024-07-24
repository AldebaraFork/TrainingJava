import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GerenciarFuncionarios {

    //INSTANCIAS DA CLASSE
    Scanner ler = new Scanner(System.in);
    static ArrayList<GerenciarFuncionarios> funcionarios= new ArrayList<>();
    Menu menu = new Menu();

    //PROPRIEDADES
    protected String NomeFuncionario;
    protected Random IdFuncionario = new Random();
    //CARGA HORARIA É DEFINIDA POR INTS NA ORDEM: HORAS, MINUTOS, SEGUNDOS
    protected Time CargaHoraria = new Time(8);
    protected double Salario;


    //METODO PARA CADASTRO DE FUNCIONARIOS
    public void CadastrarFuncionario(){

        try {

            //OBTEM OS DADOS DO USUARIO E CADASTRA NA LISTA
            System.out.print("\033[H\033[2J");
            System.out.println("Insira o nome do funcionario: ");
            NomeFuncionario = ler.nextLine().toUpperCase();
            //VERIFICA SE O NOME DO FUNCIONARIO ESTA VAZIO
            if (NomeFuncionario.isEmpty()) {
                System.out.println("Insira um valor valido");
                menu.RetornarMenuPrincipal();
            }

        }catch(Exception ex){

        }finally{
            ler.close();
        }

    }

}
