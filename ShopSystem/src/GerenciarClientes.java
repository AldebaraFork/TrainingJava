import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GerenciarClientes {

    //INSTANCIAR
    public static Scanner ler = new Scanner(System.in);
    static ArrayList<GerenciarClientes> usuarios = new ArrayList<>();

    Menu menu = new Menu();


    //PROPRIEDADES DO CLIENTE
    protected String Nome;
    protected short Idade;
    protected String Email;



//METODOS DO CLIENTE


    //CADASTRA NOVOS CLIENTES
    public void CadastrarCliente() {

        //OBTEM OS DADOS DO CLIENTE PARA SALVAR
        try {

            //VALIDA O NOME DO CLIENTE
            System.out.print("\033[H\033[2J");
            System.out.println("Digite o nome do cliente:");
            Nome = ler.next().toUpperCase();
            if (Nome.isEmpty()) {
                System.out.println("Nome invalido tente novamente");
                CadastrarCliente();
            }
            //VALIDA A IDADE DO USUARIO
            System.out.println("Digite a idade do cliente");
            Idade = ler.nextShort();
            if (Idade < 18) {
                System.out.println("Idade invalido tente novamente");
                CadastrarCliente();
            }
            //VALIDA O EMAIL DO USUARIO
            System.out.println("Digite o email do cliente: ");
            Email = ler.next();
            if (Email.isEmpty()) {
                System.out.println("Email invalido tente novamente");
                CadastrarCliente();
            }



            //MOSTRA OS DADOS AO USUARIO
            System.out.println("Informações validadas com sucesso! Dados inseridos:");
            System.out.println("Nome: " + Nome + ", Idade: " + Idade + " Email: " + Email);


            //ATRIBUI OS DADOS DO CLIENTE
            GerenciarClientes novoCliente = new GerenciarClientes();
            novoCliente.Nome = Nome;
            novoCliente.Idade = Idade;
            novoCliente.Email = Email;

            //VERIFICA SE O USUARIO  DESEJA SALVAR O USUARIO NO SISTEMA
            System.out.println("Deseja salvar o usuario? S/N");
            String RespostasSalvar = ler.next().toUpperCase();

            //SE DESEJAR SALVAR
            if (RespostasSalvar.equals("S")) {
                System.out.println("Usuario salvo com sucesso! ");
                usuarios.add(novoCliente);
                menu.RetornarMenuPrincipal();
            }
            //CASO NAO DESEJE SALVAR
            else if (RespostasSalvar.equals("n")) {
                System.out.println("Retornando ao menu principal");
                menu.RetornarMenuPrincipal();
            }
        }catch(Exception ex){
            System.out.println("Ocorreu um erro: " + ex.getMessage() + ". Tente novamente.");

        }finally{
            // Fechamento do scanner para evitar vazamento de dados
            ler.close();
        }



    }


    //VE OS CLIENTES CADASTRADOS
    public static void VerClientes(){
        //INSTANCIAS
        Menu menu = new Menu();

        //EXIBE A LISTA DE USUARIOS CADASTRADOS
        System.out.println("\nLista de Usuários Cadastrados:");
        for (GerenciarClientes usuario : usuarios) {
            System.out.println("Nome: " + usuario.Nome);
            System.out.println("Email: " + usuario.Email);
            System.out.println("Idade: " + usuario.Idade);
            System.out.println("-------------------------");
        }
        menu.RetornarMenuPrincipal();
    }


    //EXCLUI CLIENTES REGISTRADOS
    public static void ExcluirClientes(){
        //INSTANCIAS
        Menu menu = new Menu();
        GerenciarClientes novoCliente = new GerenciarClientes();

        //CASO NAO TENHAM USUARIOS CADASTRADOS

        try {
            if (usuarios.isEmpty()) {
                System.out.println("Não há usuários cadastrados, Tente cadastrar um usuario");
                Menu.RetornarMenuPrincipal();
            }

            //METODO PRINCIPAL
            System.out.print("\033[H\033[2J");
            System.out.println("Digite o nome do cliente que deseja excluir: ");
            String nomeExcluir = ler.next().toUpperCase();

            //VERIFICA O NOME DO USUARIO
            for (GerenciarClientes cliente : usuarios) {
                if (cliente.Nome.equals(nomeExcluir)) {
                    // REMOVE O CLIENTE ENCONTRADO
                    usuarios.remove(cliente);
                    System.out.println("Cliente " + nomeExcluir + " excluído com sucesso!");
                    break; // PARA O LOOP APÓS REMOVER O PRIMEIRO CLIENTE ENCONTRADO
                }
            }

            //RETORNA AO MENU PRINCIPAL
            menu.RetornarMenuPrincipal();
        }catch(Exception ex) {
          System.out.println("Ocorreu o seguinte erro: " + ex.getMessage());
        }finally{
            //EVITA VAZAR DADOS
            ler.close();
        }
    }

}
