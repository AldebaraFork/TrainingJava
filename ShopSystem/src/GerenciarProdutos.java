import java.util.ArrayList;
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


    //DEFINE AS PROPRIEDADES PARA SALVAR UM NOVO PRODUTO
    public int Quantidade;
    public String Nome;
    public double Preco;
    public double PrecoEstoque;


    public void CadastrarProduto(){



        System.out.print("\033[H\033[2J");
        //OBTEM OS DADOS DO PRODUTO
        try {
            //OBTEM O NOME DO PRODUTO
            System.out.println("Insira o nome do produto: ");
            NomeProduto = ler.nextLine().toUpperCase();
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
                menu.RetornarMenuPrincipal();
            }



            //MOSTRA OS DADOS DO PRODUTO AO CLIENTE
            System.out.println("Informações validadas com sucesso! Dados inseridos:" );
            System.out.println("Nome: " + NomeProduto + ", Preço: " + PrecoProduto + " Quantidade: " + QuantidadeProduto );



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


        try {
            System.out.println("\nLista de Produtos Cadastrados:");
            for (GerenciarProdutos novoProduto : produtos) {

                //EXIBE
                System.out.println("Nome: " + novoProduto.Nome);
                System.out.println("Quantidade: " + novoProduto.Quantidade);
                System.out.println("Preço: " + novoProduto.Preco);

                System.out.println("-------------------------");
            }
            menu.RetornarMenuPrincipal();

        }
        //TRATAMENTO DE ERRO
        catch(Exception ex){
            System.out.println("Ocorreu o erro:" + ex.getMessage());

        }finally{
            ler.close();
        }


    }


    //EXCLUI UM PRODUTO CADASTRADO
    public void ExcluirProduto(){




        try {
            //METODO PRINCIPAL
            System.out.print("\033[H\033[2J");
            System.out.println("Digite o nome do produto que deseja remover do estoque: ");
            String nomeExcluir = ler.next().toUpperCase();

            //VERIFICA SE O PRODUTO EXISTE E EXCLUI
            for (GerenciarProdutos produtos1 : produtos) {
                if (produtos1.Nome.equals(nomeExcluir)) {
                    // REMOVE O PRODUTO ENCONTRADO
                    produtos.remove(produtos1);
                    System.out.println("Produto: " + nomeExcluir + " excluído com sucesso!");
                    break; // PARA O LOOP APÓS REMOVER O PRIMEIRO CLIENTE ENCONTRADO
                } else if (nomeExcluir.isEmpty()) {
                    System.out.println("Insira um valor valido !");
                    menu.RetornarMenuPrincipal();
                }else if (nomeExcluir != produtos1.Nome){
                    System.out.println("Nome invalido!");
                }
            }
            menu.RetornarMenuPrincipal();

            //VERIFICAÇÃO DE ERRO
        }catch(Exception ex){
            System.out.println("Ocorreu o erro;" + ex.getMessage());

        }finally {

            //EVITA VAZAR DADOS
            ler.close();
        }
    }
}
