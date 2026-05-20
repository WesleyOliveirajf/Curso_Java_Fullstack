import java.util.Locale;
import java.util.Scanner;
enum DiaDaSemana1{
    segunda,
    terça,
    quarta,
    quinta,
    sexta,
    sabado,
    domingo
}

public class SwitCase {
    public static void main(String[] args) {
        System.out.println(" Enum e Switch case");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da Semana: ");
        String dia = input.nextLine();

        DiaDaSemana1 diaDaSemana = DiaDaSemana1.valueOf(dia.toUpperCase());
        switch (diaDaSemana) {
            case segunda:
                System.out.println("Executando a tarefa de SEGUNDA-FEIRA");
                break;

            case terça:
                System.out.println("Executando a tarefa de TERÇA-FEIRA");
                break;

            case quarta:
                System.out.println("Executando a tarefa de QUARTA-FEIRA");
                break;

            case quinta:
                System.out.println("Executando a tarefa de QUINTA-FEIRA");
                break;

            case sexta:
                System.out.println("Executando a tarefa de SEXTA-FEIRA");
                break;

            case sabado:
                System.out.println("Executando a tarefa de SABADO");
                break;

            case domingo:
                System.out.println("Executando a tarefa de DOMINGO");
                break;

            default:
                System.out.println("Dia inválido");
        }

    }

}
