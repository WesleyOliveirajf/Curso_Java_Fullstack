import java.util.Scanner;

        System.out.println("Estrutura de Repetição While");
        int contador = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero final: ");
        int limit = input.nextInt();
        while (contador <= limit) {
            System.out.println(" Contador = " + contador);
            contador++;

            if (contador == 5) {
                break;
            }

        }

        contador++;
    }
}

