import java.util.Locale;
import java.util.Scanner;
enum DiaDaSemana{
    Segunda,
    terça,
    quarta,
    quinta,
    sexta,
    sabado,
    domingo
}

public class EnunCase {
    public static void main(String[] args) {
        System.out.println(" Enum e Switch case");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da Semana: ");
        String dia = input.nextLine();

        DiaDaSemana diaDaSemana = DiaDaSemana.valueOf(dia.toUpperCase());

        if (diaDaSemana == DiaDaSemana.Segunda){
            System.out.println(diaDaSemana + " Execultado");
        } else if (diaDaSemana == DiaDaSemana.terça) {
            System.out.println(diaDaSemana + " Execultado");
        } else if (diaDaSemana == DiaDaSemana.quarta) {
            System.out.println(diaDaSemana + " Execultado");
        } else if (diaDaSemana == DiaDaSemana.quinta) {
            System.out.println(diaDaSemana + " Execultado");
        } else if (diaDaSemana == DiaDaSemana.sexta) {
            System.out.println(diaDaSemana +" Execultado");
        } else if (diaDaSemana == DiaDaSemana.sabado) {
            System.out.println(diaDaSemana +" Execultado");
        } else {
            System.out.println(diaDaSemana + " Execultado");
        }

        input.close();
    }

 }
