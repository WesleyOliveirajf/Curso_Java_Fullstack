import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        int a = input.nextInt();

        System.out.println("Digite segundo um numero: ");
        int b = input.nextInt();
        System.out.println("a = " + a + "  ,b = " + b );

        int resultado = a + b ;
        System.out.println("Resultado é: " + resultado);



    }
}
