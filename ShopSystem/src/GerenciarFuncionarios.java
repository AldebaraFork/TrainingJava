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
            System.out.print("\033[H\033[2J");
            System.out.println("Insira o CARGO do funcionar:");
            System.out.println("Cargos disponiveis: JOVEM APRENDIZ, FUNCIONARIO, SUPERVISOR");
            CargoFuncionario = ler.nextLine().toUpperCase();
            //FUNCIONARIO SEJA JOVEM APRENDIZ
            if (CargoFuncionario.equals("JOVEM APRENDIZ")){
                SalarioFuncionario = 1400;
                CargaHoraria = new Time(6);
            }
            //FUNCIONARIO PADRAO
            else if (CargoFuncionario.equals("FUNCIONARIO")){
                SalarioFuncionario = 2500;
                CargaHoraria = new Time(4);
            }
            //SUPERVISOR
            else if (CargoFuncionario.equals("SUPERVISOR")){
                SalarioFuncionario = 3500;
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


            //MOSTRA OS DADOS AO FUNCIONARIO
            System.out.println("Informações validadas com sucesso! Dados inseridos:");
            System.out.println("Nome: " + NomeFuncionario + ", Salario: " + SalarioFuncionario + " Cargo: " + CargoFuncionario + " Carga Horaria: " + CargaHoraria);

            //SALVA O FUNCIONARIO
            System.out.println("Deseja salvar o funcionario no sistema? S/N");
            String RespostaSalvar = ler.nextLine().toUpperCase();

            //CASO DESEJE SALVAR O CLIENTE
            if (RespostaSalvar.equals("S") || RespostaSalvar.equals("SIM")){
                funcionarios.add(novoFuncionario);
                System.out.println("Usuario salvo com sucesso");
                menu.MenuFuncionarios();

            }else if (RespostaSalvar.equals("N") || RespostaSalvar.equals("NAO"))
            {
                System.out.println("Usuario não salvo!");
                menu.RetornarMenuPrincipal();

            }else {
                System.out.println("Reposta invalida, tente novamente");
                menu.RetornarMenuPrincipal();
            }





        }catch(Exception ex){
            System.out.println("Ocorreu o erro: " + ex.getMessage());

        }finally{
            ler.close();
        }

    }

    public void VerFuncionarios(){

        try {
            //EXIBE A LISTA DE USUARIOS CADASTRADOS
            System.out.print("\033[H\033[2J");
            System.out.println("\nLista de Usuários Cadastrados:");
            for (GerenciarFuncionarios funcionarios1 : funcionarios) {
                System.out.println("Nome: " + funcionarios1.Nome);
                System.out.println("Cargo: " + funcionarios1.Cargo);
                System.out.println("Salario: " + funcionarios1.Salario);
                System.out.println("Carga horaria: " + funcionarios1.Horas);
                System.out.println("-------------------------");
            }
            menu.RetornarMenuPrincipal();
        }
        //TRATAMENTO DE ERRO
        catch(Exception ex){
            System.out.println("Ocorreu o erro: " + ex.getMessage());
        }
        //FECHA O SCANNER
        finally{
            ler.close();
        }
    }

    public void ExcluirFuncionario(){
        try{

        }

    }

}
