import java.util.Scanner;

public class Exe02Uni02 {

    public static void main(String[] args) {
        // Leitura
        Scanner teclado = new Scanner (System.in);
     
        System.out.print("Informe o raio:");
        double raio = teclado.nextDouble();

        //calcular a área
        double area = Math.PI * Math.pow(raio, 2);

        // exibir resultado
        System.out.printf("Área do círculo: %.2f%n", area);
    }
}
