package teste;

import java.util.Scanner;


public class Hospital {
    private static String nome;
    private static int dia;
    private static int mes;
    private static int ano;
    private static String cep;
    private static String rua;
    private static String bairro;
    private static String numeroCasa;
    private static String complemento;
    private static String cidade;
    private static String estado;
    private static String telefoneProprio;
    private static String telefoneConhecido;
    private static String sexo;
    private static String cor;
    private static String civil;
    private static String cpf;
    private static String rg;
    private static String escolaridade;
    private static String sus;
    public  static int opcao;

    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            dadosRecepcao  novoRecepcao = new dadosRecepcao();
            
            do{
                System.out.println("------------------------------------------ ");
                System.out.println("                   Menu ");
                System.out.println("Escolha uma opção ");
                System.out.println("1 - Inserir paciente ");
                System.out.println("2 - Listar Pacientes ");
                System.out.println("0 - Sair ");
                 opcao = leitura.nextInt();
                
                 switch(opcao){
                     case 1 -> {
                         do{
                             System.out.println("Digite seu nome completo : ");
                             nome= leitura.nextLine();
                         }while(nome.length() <  2  || nome.length()  > 60 );
                         
                         do{
                             System.out.println("Digite sua data de nascimento : ");
                             System.out.println("Dia : ");
                             dia= leitura.nextInt();
                             System.out.println("Mês : ");
                             mes= leitura.nextInt();
                             System.out.println("Ano : ");
                             ano= leitura.nextInt();
                         }while(dia <=  0  || dia  >= 32 || mes <=  0  || mes >= 13 || ano <=  1900  || ano  >= 2022 );
                         
                         do{
                             System.out.println("Digite o CEP : ");
                             cep= leitura.nextLine();
                         }while(cep.length() != 8 );
                         
                         do{
                             System.out.println("Digite a Rua : ");
                             rua= leitura.nextLine();
                         }while(rua.length() <  3  || rua.length()  > 50 );
                         
                         do{
                             System.out.println("Digite o Bairro : ");
                             bairro= leitura.nextLine();
                         }while(bairro.length() <  3  || bairro.length()  > 50 );
                         
                         do{
                             System.out.println("Digite o número da casa : ");
                             numeroCasa= leitura.nextLine();
                         }while(numeroCasa.length() <  0  || numeroCasa.length()  > 5 );
                         
                         do{
                             System.out.println("Digite o Complemento : ");
                             complemento= leitura.nextLine();
                         }while(complemento.length()  > 100 );
                         
                         do{
                             System.out.println("Digite a sua Cidade : ");
                             cidade= leitura.nextLine();
                         }while(cidade.length() <  2  || cidade.length()  > 30 );
                         
                         do{
                             System.out.println("Digite o seu Estado : ");
                             estado= leitura.nextLine();
                         }while(estado.length() <  2  || estado.length()  > 30 );
                         
                         do{
                             System.out.println("Digite seu Telefone : ");
                             telefoneProprio= leitura.nextLine();
                         }while(telefoneProprio.length() <  8  || telefoneProprio.length()  > 11 );
                         
                         do{
                             System.out.println("Digite o Telefone de um conhecido : ");
                             telefoneConhecido= leitura.nextLine();
                         }while(telefoneConhecido.length() <  8  || telefoneConhecido.length()  > 11 );
                         
                         do{
                             System.out.println("Digite seu sexo : ");
                             sexo= leitura.nextLine();
                         }while(sexo.length() <  2  || sexo.length()  > 20 );
                         
                         do{
                             System.out.println("Digite sua Cor/Raça : ");
                             cor= leitura.nextLine();
                         }while(cor.length() <  4  || cor.length()  > 20 );
                         
                         do{
                             System.out.println("Digite o seu estado cívil : ");
                             civil= leitura.nextLine();
                         }while(civil.length() <  2  || civil.length()  > 60 );
                         
                         do{
                             System.out.println("Digite o seu cpf : ");
                             cpf= leitura.nextLine();
                         }while(cpf.length() <  2  || cpf.length()  > 60 );
                         
                         do{
                             System.out.println("Digite o seu rg : ");
                             rg= leitura.nextLine();
                         }while(rg.length() <  2  || rg.length()  > 60 );
                         
                         do{
                             System.out.println("Digite a sua escolaridade : ");
                             escolaridade= leitura.nextLine();
                         }while(escolaridade.length() <  2  || escolaridade.length()  > 60 );
                         
                         do{
                             System.out.println("Digite o numero do cartão do sus : ");
                             sus= leitura.nextLine();
                         }while(sus.length() <  2  || sus.length()  > 60 );
                         
                         novoRecepcao = new dadosRecepcao(nome, dia, mes, ano, cep, rua,  bairro, numeroCasa,complemento, cidade, estado, telefoneProprio, telefoneConhecido, sexo, cor,civil, cpf, rg, escolaridade, sus);                   
                         break;
                            }
                         case 2 -> {
                             
                          }
                     
                         
                    }
                     
                 
                  }while(opcao != 0);
           
    }
}
    

