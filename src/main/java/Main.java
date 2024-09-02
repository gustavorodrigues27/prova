import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome e sobre nome: ");
     String nome = sc.nextLine();
    System.out.println("Digite seu gênero: ");
    String masculino = sc.nextLine();
    String feminino = sc.nextLine();
    System.out.println("digite sua idade: ");
    double idade = sc.nextDouble();
    System.out.println("digite sua altura");
    double altura = sc.nextDouble();

    if ("masculino" == masculino){
      System.out.printf("(72.7 * altura)", - 58);
      
      
    }
    if ("feminino" == feminino){
      System.out.printf((62.1 * altura), - 58)
    }
    
        
  
    if (sc.nextLine().equals("masculino")){
      System.out.println("Olá Gustavo Rodrigues, fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar");
                    
    }






    sc.close();
    
  }

 
}