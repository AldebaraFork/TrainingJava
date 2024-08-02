import java.util.ArrayList;
import java.util.Scanner;

public class CriarContaJuridica {

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);
    Conta novaContaJuridica = new Conta();
     static ArrayList<CriarContaJuridica> contasJuridicas = new ArrayList<>();


    //PROPRIEDADES PARA SALVAR O PJ NA LISTA
    public String NOMEPJ;
    protected String CNPJ;
    protected String EMAIL;
    protected double SALDOPJ;




    //METODO PARA CRIAR A CONTA JURIDICA E SALVAR NA LISTA
    public void MetodoCriaContaJuridica() {
        MenuBanco menu = new MenuBanco();
        try {

            //OBYTEM OS DADOS DA PESSOA JURIDICA
            System.out.println("Digite o CNPJ: ");
            novaContaJuridica.cnpj = ler.nextLine();
            //VALIDA O CNPJ
            if (novaContaJuridica.cnpj.length() != 11) {
                System.out.println("Insira um CNPJ valido! ");
                MetodoCriaContaJuridica();
            }
            //VALIDA O EMAIL
            System.out.println("Digite o email: ");
            novaContaJuridica.email = ler.nextLine();
            if (novaContaJuridica.email.contains("@")){
                System.out.println("Email validado com sucesso! ");
            }else{
                System.out.println("Insira um email valido !");
                MetodoCriaContaJuridica();
            }
            //VALIDA O NOME
            System.out.println("Digite o nome da pessoa jurídica: ");
            novaContaJuridica.NomeTitularPJ = ler.nextLine().toUpperCase();
            if (novaContaJuridica.NomeTitularPJ.isEmpty() ){
                System.out.println("Insira um nome valido! ");
                MetodoCriaContaJuridica();
            }



            //CONSTRUTOR PARA SALVAR A CONTA PJ
            CriarContaJuridica contaJuridica = new CriarContaJuridica();
            contaJuridica.NOMEPJ = novaContaJuridica.NomeTitularPJ;
            contaJuridica.CNPJ = novaContaJuridica.cnpj;
            contaJuridica.EMAIL = novaContaJuridica.email;
            contaJuridica.SALDOPJ = novaContaJuridica.saldoPj;


            //SALVA A CONTA E EXIBE AO USUARIO
            contasJuridicas.add(contaJuridica);

            System.out.println("Conta criada com sucesso! " +
                    "Nome titular: " + novaContaJuridica.NomeTitularPJ + " CNPJ: "
                    + novaContaJuridica.cnpj + " Email: " + novaContaJuridica.email + " Saldo: " + novaContaJuridica.saldoPj);
            menu.RetornarMenu();
        }catch(Exception ex) {
            System.out.println("Ocorreu o erro: " + ex.getMessage() + "Tente novamente");
        }finally{
            ler.close();
        }


    }
    public void VisualizarContasPJ(){
        MenuBanco menu = new MenuBanco();
        System.out.println("Contas PJ cadastradas: ");
        if (contasJuridicas.isEmpty()) {
            System.out.println("Não há contasFisicas jurídicas cadastradas.");
        }else {
            for (CriarContaJuridica contaJuridica : contasJuridicas) {
                System.out.println("----------------------------------");
                System.out.println("Nome titular: " + contaJuridica.NOMEPJ);
                System.out.println("Cnpj: " + contaJuridica.CNPJ);
                System.out.println("Email: " + contaJuridica.EMAIL);
                System.out.println("Saldo na conta: " + contaJuridica.SALDOPJ);
                System.out.println("----------------------------------");
            }
        }
        menu.RetornarMenu();

    }
    public void RemoverContasPJ() {
        MenuBanco menu = new MenuBanco();
        //VERIFICA SE A LISTA ESTÁ VAZIA ANTES DE EXERCUTAR O METODO
        if (contasJuridicas.isEmpty()) {
            System.out.println("Não há contas cadastradas");
         } else {
            //METODO PARA EXCLUIR A CONTA
            System.out.println("Insira o email da conta que deseja excluir: ");
            String RemoverPJ = ler.nextLine();
            for (CriarContaJuridica contaJuridica : contasJuridicas) {
                if (contaJuridica.EMAIL.equals(RemoverPJ)) {
                    contasJuridicas.remove(contaJuridica);
                    System.out.println("Conta removida com sucesso!");
                    menu.RetornarMenu();
                    break;
                }

            }
            //VERIFICA SE O USUARIO INSERIU O NOME PARA EXCLUIR A CONTA
                 if (RemoverPJ.isEmpty()) {
                     System.out.println("Insira um nome valido");
                     menu.RetornarMenu();
                 }
        }

    }
}
