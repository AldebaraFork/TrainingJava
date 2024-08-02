import java.util.Scanner;



public class Conta {

    //INSTANCIAS
    Scanner ler = new Scanner(System.in);


    //PROPRIEDADES DE UMA CONTA FISICA
    protected String nomeTitular;
    protected double saldo;
    protected int agencia;
    protected String cpf;

    //PROPRIEDADES DE UMA CONTA JURIDICA
    protected String cnpj;
    protected String email;
    protected String NomeTitularPJ;
    protected double saldoPj;



    //METODOS TODAS AS CONTAS TEM

    //DEPOSITO
    public double Depositar(double valorDeposito){
        System.out.println("Insira a quantidade para deposito: ");
        valorDeposito = ler.nextDouble();
        if(valorDeposito <= 0 ){
            System.out.println("Insira um valor valido! ");

        }
        this.saldo = this.saldo + valorDeposito;
        System.out.println("Valor depositado com sucessp, saldo atual: " + saldo);

        return this.saldo;
    }
    //SAQUE
    public double Saque(double valorSaque){

        System.out.println("Insira a quantidade para saque: ");
        valorSaque = ler.nextDouble();
        if (valorSaque > this.saldo || valorSaque < 0){
            System.out.println("Impossivel sacar, não há saldo suficiente");
        }else{
            this.saldo =- valorSaque;
            System.out.println("Saque realizado com sucesso, Saldo atual: " + this.saldo);
        }
        return this.saldo;
    }

    //TRANSFERIR PARA OUTRA CONTA
    public boolean Transferir(double valorTransferencia, String NomeTransferencia){
        //INSTANCIAS
        CriarContaJuridica contaJuridica = new CriarContaJuridica();
        CriarContaPessoaFisica contaFisica = new CriarContaPessoaFisica();


        //METODO PARA AS TRANSAÇÕES
        System.out.println("Insira a quantidade para transferir: ");
        valorTransferencia = ler.nextDouble();
        System.out.println("Para quem quer transferir?");
        NomeTransferencia = ler.nextLine().toUpperCase();
        if (NomeTransferencia.equals(contaFisica.NOME) ){
            System.out.println("A conta se refere a pessoa fisica! ");
            this.saldo =- valorTransferencia;
            if(this.saldo < valorTransferencia){
                System.out.println("Saldo insuficiente");
            }else {
                System.out.println("Transferencia realizada com sucesso");
                return true;
            }
        }else if (NomeTransferencia.equals(contaJuridica.NOMEPJ)){
            System.out.println("A conta se refere a pessoa jurídica! ");
            this.saldoPj =- valorTransferencia;
            if(this.saldoPj < valorTransferencia){
                System.out.println("Saldo insuficiente");
            }else {
                System.out.println("Transferencia realizada com sucesso");
                return true;
            }
        }else {
            System.out.println("Nome não cadastrado no sistema, tente novamente");
        }

        return false;
    }
}