import java.util.Scanner;

public class projetoCalculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora de Soma");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o operador: + / - ou * : ");
        String operador = input.nextLine();

        System.out.println("Digite o Primeiro numero: ");
        int a = input.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        int b = input.nextInt();

        if (operador.equals("+")) {
            int soma = a + b;
            System.out.println("Soma dos Valores: " + a + "+" + b + ": " + soma);
        } else if (operador.equals("-")){
            int menos = a-b;
            System.out.println("O Valores: " + a + "-" + b + ": " + menos);
        } else {
            int multi = a * b ;
            System.out.println("O Valores: " + a + "*" + b + ": " + multi);

        }


    }





}
