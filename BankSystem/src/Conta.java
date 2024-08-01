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
    public double Transferir(double valorTransferencia, String NomeTransferencia){
        System.out.println("Insira a quantidade para transferir: ");
        valorTransferencia = ler.nextDouble();
        System.out.println("Para quem quer transferir?");
        NomeTransferencia = ler.nextLine().toUpperCase();
        if (NomeTransferencia == this.nomeTitular ){
            System.out.println("A conta se refere a pessoa fisica! ");
            this.saldo =+ valorTransferencia;
            return this.saldo;
        }else if (NomeTransferencia == this.NomeTitularPJ){
            System.out.println("A conta se refere a pessoa jurídica! ");
            this.saldoPj =+ valorTransferencia;
            return this.saldoPj;
        }else {
            System.out.println("Nome não cadastrado no sistema, tente novamente");
        }

        return this.saldo;
    }
}