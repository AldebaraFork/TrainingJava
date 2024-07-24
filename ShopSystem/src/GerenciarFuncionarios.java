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



}
