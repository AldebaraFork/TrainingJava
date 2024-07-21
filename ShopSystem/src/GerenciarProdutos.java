import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GerenciarProdutos {


    //INSTANCIAS
    Scanner ler = new Scanner(System.in);
    static ArrayList<GerenciarProdutos> produtos= new ArrayList<>();
    Menu menu = new Menu();


    //PROPRIEDADES DO PRODUTO
    protected String NomeProduto;
    protected double PrecoProduto;
    protected int QuantidadeProduto;
    protected Random IdProduto;

    //DEFINE AS PROPRIEDADES PARA SALVAR UM NOVO PRODUTO
    protected int Quantidade;
    protected String Nome;
    protected double Preco;
    protected  Random Id;


    public void CadastrarProduto(){
        IdProduto = new Random();
        System.out.print("\033[H\033[2J");
        //OBTEM OS DADOS DO PRODUTO
        try {
            //OBTEM O NOME DO PRODUTO
            System.out.println("Insira o nome do produto: ");
            NomeProduto = ler.next().toUpperCase();
            //VERIFICA SE O NOME DO PRODUTO ESTA VAZIO
            if (NomeProduto.isEmpty()){
                System.out.println("Insira o nome do produto! ");
                System.exit(0);
            }
            //OBTEM O PREÇO DO PRODUTO
            System.out.println("Insira o valor do produto");
            PrecoProduto = ler.nextDouble();
              //VERIFICA O PREÇO DO PRODUTO
            if (PrecoProduto <= 0){
                System.out.println("Insira um valor valido ao produto");
            }
            //QUANTIDADE DE PRODUTOS
            System.out.println("Insira o quantidade do produto");
            QuantidadeProduto = ler.nextInt();
            //VERIFICA A QUANTIDADE DE PRODUTOS
            if (QuantidadeProduto <= 0){
                System.out.println("Insira uma quantidade valida para adicionar ao estoque");
            }
            //GERA A ID DO PRODUTO
             IdProduto = new Random(10000);


            //MOSTRA OS DADOS DO PRODUTO AO CLIENTE
            System.out.println("Informações validadas com sucesso! Dados inseridos:" );
            System.out.println("Nome: " + NomeProduto + " Preço: " + PrecoProduto + " Quantidade: " + QuantidadeProduto + " ID GERADO: " + IdProduto);


            //INSTANCIAS PARA SALVAR O PRODUTO CADASTRADO
            GerenciarProdutos novoProduto = new GerenciarProdutos();
            novoProduto.Nome = NomeProduto;
            novoProduto.Preco = PrecoProduto;
            novoProduto.Quantidade = QuantidadeProduto;


            //PERGUNTA AO CLIENTE SE DEJESA SALVAR O PRODUTO
            System.out.println("Dados obtidos! Deseja salvar esse produto? S/N");
            String RespostaProduto = ler.next().toUpperCase();
            //CASO QUEIRA SALVAR
            if (RespostaProduto.equals("S") || RespostaProduto.equals("SIM"))
            {
                System.out.println("Produto salvo com sucesso! Retornando ao menu");
                produtos.add(novoProduto);
                menu.RetornarMenuPrincipal();

            }
            //CASO NAO QUEIRA SALVAR
            else if (RespostaProduto.equals("N") || RespostaProduto.equals("NAO"))
            {
               System.out.println("Produto não salvo ! Retornando ao menu ");
               menu.RetornarMenuPrincipal();
            }
            else {
                System.out.println("Erro ao tentar salvar o produto");
            }
        }
        //TRATAMENTO DE ERRO
        catch(Exception ex)
        {
            System.out.println("Ocorreu o erro;" + ex.getMessage() + " Tente novamente");

        }finally {
            ler.close();
        }


    }


    public void VisualizarProdutos(){
        //INSTANCIA PARA RETORNAR AO MENU
        Menu menu = new Menu();
        System.out.println("\nLista de Produtos Cadastrados:");
        for(GerenciarProdutos produto: produtos){
            System.out.println("Nome: " + produto.Nome);
            System.out.println("Quantidade: " + produto.QuantidadeProduto);
            System.out.println("Preço: " + produto.PrecoProduto);
            System.out.println("ID: " + produto.IdProduto);
            System.out.println("-------------------------");
        }


    }
}
