import java.util.Scanner;

public class Uni7Exe2 {

    private int contarPalavras(String palavra, String frase) {
        /* este método conta quantas vezes a palavra aparece na frase */

        // acrescentar um espaço em branco no fim da frase para testar a última palavra
        frase += " ";

        // contador das palavras
        int qtadePalavras = 0;

        // inicializar palavra para retirar da frase
        String novaPalavra = "";

        // percorrer a frase
        for (int cont = 0; cont < frase.length(); cont++) {
            // ver se na posição cont tem uma letra e não um espaço em branco
            if (frase.charAt(cont) != ' ') { // sempre que usar string deve ser usado o charat

                // acrescentar a letra na nova palavra
                novaPalavra += frase.charAt(cont);
            } else {
                // verificar se é a palavra pesquisada
                if (palavra.equalsIgnoreCase(novaPalavra)) {

                    // contar a palavra
                    qtadePalavras++;

                }
                // reiniciar a palavra
                novaPalavra = "";
            }
        }
        // retornar o resultado
        return qtadePalavras;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Criar um objeto para chamar o metódo
        Uni7Exe2 exercicio = new Uni7Exe2();

        // ler as entradas
        System.out.println("Digite uma frase");
        String frase = teclado.nextLine();
        System.out.println("Digite uma palavra");
        String palavra = teclado.nextLine();

        // chamar a função que corta as palavras na frase
        int qtadePalavras = exercicio.contarPalavras(palavra, frase);

        System.out.println("A palavra aparece " + qtadePalavras + "  na frase.");

    }
}
