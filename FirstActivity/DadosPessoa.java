
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

   public class DadosPessoa {
 

      public String Nome;

      public Short Idade;

      public String Email;

      public void Usuario(String nome, String email, Short idade) {
         this.Nome = nome;
         this.Email = email;
         this.Idade = idade;
     }


      public void CadastrarCliente(){

         ArrayList<DadosPessoa> usuarios = new ArrayList<>();

                  //INSTANCIAS
                     DadosPessoa usuario = new DadosPessoa();
                     Menu menu = new Menu();
                     Scanner ler = new Scanner(System.in);
            try {
                     //VALIDA O NOME DO USUARIO PARA PROSSEGUIR
                     System.out.println("Insira o nome do usuario:");
                     Nome = ler.nextLine();

                     //CASO O NOME ESTEJA VAZIO
                     if (Nome.isEmpty()) {
                        System.out.println("insira um nome valido!");
                        System.exit(0);
                     }
                     //CASO NOME ESTEJA CORRETO
                     else{

                        //VALIDA A IDADE DO USUARIO
                        System.out.println("Agora insira a idade do usuario:");
                        Idade = ler.nextShort();

                        //USUARIO MENOR QUE IDADE
                        if (Idade < 18){
                           System.out.println("Usuário ainda é menor de idade! ");
                           System.exit(0);                 
                        }
                        //USUARIO MAIOR DE IDADE
                        else if(Idade >= 18){

                           //VALIDA O EMAIL 
                           System.out.println("Agora insira o Email do usuário: ");
                           Email = ler.next();

                           //EMAIL VAZIO 
                           if (Email.isEmpty()) {
                              System.out.println("Email invalido, tente novamente");
                              System.exit(0);
                           }

                           //EMAIL VALIDO
                           else
                           {
                         //MOSTRA OS DADOS QUE O USUARIO O INSERIU             
                           System.out.print("\033[H\033[2J");     
                           System.out.println("Email validado com sucesso! Dados inseridos abaixo:");
                           System.out.println("Nome: " + Nome + ", Idade: " + Idade + ", Email: " + Email);  
                          
                           
                           //PERGUNTA SE O USUARIO DESEJA CADASTRAR O CLIENTE NA LISTA
                           System.out.println("Deseja salvar o usuário? (S/N)");
                           String continuar = ler.next().toUpperCase();

                           //SE DESEJA CADASTRAR
                           if (continuar == "S" || continuar == "SIM") {
                              System.out.println("Usuario Salvo com sucesso");
                              usuarios.add(usuario);
                           }
                           
                           //CASO NAO DESEJE CADASTRAR
                           else if (continuar == "N" || continuar == "NAO"){
                             System.out.println("Retornando ao menu");
                             menu.MenuPrincipal();
                           }         
                        }
                     }
                  }  
            //VALIDAÇÃO DE ERROS
            } catch (Exception ex) {
               System.out.println("Ocorreu um erro: " + ex.getMessage() + ". Tente novamente.");
         }finally {
            // Fechamento do scanner para evitar vazamento de dados
            ler.close();
      } 
   }
   public void VisualizarClientes(){
      ArrayList<DadosPessoa> usuarios = new ArrayList<>();
       //EXIBE A LISTA DE USUARIOS CADASTRADOS
       System.out.println("\nLista de Usuários Cadastrados:");
       for (DadosPessoa usuariDadosPessoa : usuarios) {
           System.out.println(usuariDadosPessoa);
           System.out.println("------------------------");
       }
   }
 }
              
