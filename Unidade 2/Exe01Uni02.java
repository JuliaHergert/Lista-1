import java.util.Scanner;

public class Exe01Uni02 {

    public static void main(String[] args) {
    System.out.print("Funciona!!!");
    //variáveis
    int valor1, valor2, soma;

    //classe para leitura dos dados
    Scanner teclado = new Scanner (System.in);

    //comando de leitura
    valor1 = teclado.nextInt();
    valor2 = teclado.nextInt();

    //somar os valores
    soma = valor1 + valor2;

    //escrever o resultado
    System.out.println("Soma = "+ soma);
    teclado.close();

    }
}