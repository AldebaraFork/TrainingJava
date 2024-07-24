import java.sql.Array;
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
    protected Time CargaHoraria;
    protected double SalarioFuncionario;
    protected String CargoFuncionario;


    //PROPRIEDADES PARA SALVAR O FUNCIONARIO NA LISTA
    protected String Nome;
    protected double Salario;
    protected String Cargo;
    protected Time Horas;


    //METODO PARA CADASTRO DE FUNCIONARIOS
    public void CadastrarFuncionario(){

        //PROPRIEDADES PODEM MUDAR DE ACORDO COM O CARGO DO FUNCIONARIO

        //VERIFICAÇÃO DE CARGO E OBTER OS DADOS DO FUNCIONARIOq
        try {


            System.out.println("Insira o CARGO do funcionar:");
            System.out.println("Cargos disponiveis: JOVEM APRENDIZ, FUNCIONARIO, SUPERVISOR");
            CargoFuncionario = ler.nextLine().toUpperCase();
            //FUNCIONARIO SEJA JOVEM APRENDIZ
            if (CargoFuncionario.equals("JOVEM APRENDIZ")){
                Salario = 1400;
                CargaHoraria = new Time(6);
            }
            //FUNCIONARIO PADRAO
            else if (CargoFuncionario.equals("FUNCIONARIO")){
                Salario = 2500;
                CargaHoraria = new Time(8);
            }
            //SUPERVISOR
            else if (CargoFuncionario.equals("SUPERVISOR")){
                Salario = 3500;
                CargaHoraria = new Time(8);
            }else {
                System.out.println("Insira uma opção valida !");
                menu.RetornarMenuPrincipal();
            }

          //OBTEM O NOME DO FUNCIONARIO
            System.out.println("Insira o nome do funcionario");
            NomeFuncionario = ler.nextLine().toUpperCase();


            //INSTANCIA PARA SALVAR O FUNCIONARIO

            GerenciarFuncionarios novoFuncionario = new GerenciarFuncionarios();
            novoFuncionario.Nome = NomeFuncionario;
            novoFuncionario.Salario = SalarioFuncionario;
            novoFuncionario.Cargo = CargoFuncionario;
            novoFuncionario.Horas = CargaHoraria;

            //SALVA O FUNCIONARIO
            





        }catch(Exception ex){

        }finally{
            ler.close();
        }

    }

}
