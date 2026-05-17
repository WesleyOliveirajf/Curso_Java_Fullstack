import java.util.Scanner;

public class ifEelse {
    public static void main(String[] args) {
        System.out.println("Tomada de decisao");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println(("Sua idade e: ") + idade);
        } else if (idade >= 12) {
            System.out.println("Adolencente");
        } else

            System.out.println("Menor de idade");
    }
}