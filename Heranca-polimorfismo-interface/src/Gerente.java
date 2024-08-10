public class Gerente extends Supervisor{


    //PROPRIEDADES DE UM GERNTE
    private String id;


    //METODOS ID
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public void validaId(String id){
        System.out.println("Cadastre seu id, cada id possui 8 caracteres! ");
        id = ler.nextLine();
        if(id.length() != 8 || id.isBlank() ){
            System.out.println("ID invalido, tente novamente");
            System.exit(0);

        }else {
            setId(id);
        }
    }


    //METODOS SALARIO
    public double getSalario(){
        return super.getSalario();
    }
    public void setSalario(double salario){
        super.setSalario(salario);
    }
    public void validaSalario(double salario){
        System.out.println("Insira o salario do gerente");
        salario = ler.nextDouble();
        if (salario != 5000){
            System.out.println("Salario invalido, tente novamente");
            System.exit(0);
        }else {
            setSalario(salario);
        }

    }

    public double getBonificacao(){
        return super.getSalario() * 1.25;
    }

}
