import java.util.Scanner;

public class inptus {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Digite seu nome: ");
         String nome = input.nextLine();

         System.out.println("Digite sua idade: ");
         int idade = input.nextInt();

         System.out.println("Meu nome e : " + nome);
         System.out.printf("Minha idade e: " + idade);
         System.out.printf("Meu nome e: " + nome + "e minha idade e : " + idade + "anos .");


    }
}
