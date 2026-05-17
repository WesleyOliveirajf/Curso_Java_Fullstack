public class Variaveis {
     public void main(String[] args) {
         // Tipo de String
         String meuNome = "Fabiano";
         String  mensagem = " O meu nome e " + meuNome;

         System.out.println(mensagem);

         // Variavel idade
         int idade = 43;
         System.out.println("Idade e " + idade);

         // Tipo Boolean

         boolean ativo = true;
         System.out.println("o Sistema esta ativo = " + ativo);

         // Tipo Double
         double valor = 100.56;
         System.out.println("O Valor e: "+ valor);


         // Mensagem final com todos os dados em uma unica linha
         String msnFinal = " Meu nome é:"+ meuNome + " a idade e: " + idade + " Meu Sistema esta: "+ ativo + "e o valor do sistema é: " + valor;
         System.out.println(msnFinal);


    }
}
