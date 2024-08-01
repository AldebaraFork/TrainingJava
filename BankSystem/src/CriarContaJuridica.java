import java.util.ArrayList;
import java.util.Scanner;

public class CriarContaJuridica {

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);
    Conta novaContaJuridica = new Conta();
    ArrayList<Conta> contas = new ArrayList<Conta>();


    //METODO PARA CRIAR A CONTA JURIDICA E SALVAR NA LISTA
    public void MetodoCriaContaJuridica() {

        try {

            //OBYTEM OS DADOS DA PESSOA JURIDICA
            System.out.println("Digite o CNPJ: ");
            novaContaJuridica.cnpj = ler.nextLine();
            //VALIDA O CNPJ
            if (novaContaJuridica.cnpj.length() != 11) {
                System.out.println("Insira um CNPJ valido! ");
            }
            System.out.println("Digite o email: ");
            novaContaJuridica.email = ler.nextLine();
            //VALIDA O EMAIL
            if (novaContaJuridica.email.contains("@")){
                System.out.println("Email validado com sucesso! ");
            }else{
                System.out.println("Insira um email valido !");
            }
            //VALIDA O NOME
            System.out.println("Digite o nome da pessoa jurídica: ");
            novaContaJuridica.NomeTitularPJ = ler.nextLine().toUpperCase();
            if (novaContaJuridica.NomeTitularPJ.isEmpty() ){
                System.out.println("Insira um nome valido! ");
            }
        }catch(Exception ex) {
            System.out.println("Ocorreu o erro: " + ex.getMessage() + "Tente novamente");
        }finally{
            ler.close();
        }


    }

}
