
import java.util.Scanner;

   public class DadosPessoa {

      public String Nome;

      public Short Idade;

      protected String Email;

               public void CadastrarCliente(){

                  //INSTANCIAS
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
                           System.out.println("Email validado com sucesso! Dados inseridos abaixo:");
                           System.out.println("Nome: " + Nome + ", Idade: " + Idade + ", Email: " + Email);
                           wait(3000);
                           menu.MenuPrincipal();
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
         }
              
