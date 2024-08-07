public class Cliente {

    //PROPRIEDADES DE UM CLIENTE
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private char sexo;

    //CONSTRUTOR DE UM CLIENTE
    public Cliente(String cpf, String rg){
        //VALIDA O CPF
        if(cpf.length() != 11 ){
            System.out.println("CPF invalido! Tente novamente.");
            System.exit(0);
        }else {
            System.out.println("CPF validado!");
            this.cpf = cpf;
        }
        //VALIDA O RG
        if(rg.length() != 9){
            System.out.println("RG invalido! Tente novamente.");
            System.exit(0);
        }else {
            System.out.println("RG validado!");
            this.rg = rg;
        }

    }

    //METODOS DE TODO USUARIO


    //APLICANDO GET E SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getRg(){
        return this.rg;
    }



    



}
