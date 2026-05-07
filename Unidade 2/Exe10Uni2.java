import java.util.Scanner;

public class Exe10Uni2 {
    public static void main(String[] args) {
        int duracaoSegundos = 5000;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a duração em segundos:");
        duracaoSegundos = teclado.nextInt();
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        
        System.out.printf("Tempo de duração: %02d:%02d:%02d%n", horas, minutos, duracaoSegundos % 60);                              

        
        /*Uni2Exe10 [1][1019]
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos. */
    }

}
