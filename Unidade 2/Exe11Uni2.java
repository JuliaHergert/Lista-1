import java.util.Scanner;

public class Exe11Uni2 {
    public static void main(String[] args){
    int valor_A, valor_B, valor_C;
    Scanner teclado = new Scanner (System.in);
    System.out.print("Informe o valor A:");
    valor_A = teclado.nextInt();
    System.out.print("Informe o valor B:");
    valor_B = teclado.nextInt();
    System.out.print("Informe o valor C:");
    valor_C = teclado.nextInt();
    double pi = 3.14159;
    double areaTriangulo = (valor_A * valor_C) /2;
    double areacirculo = pi * Math.pow(valor_C, 2);
    double areaTrapezio = ((valor_A + valor_B) * valor_C)/2;
    double areaquadrado = Math.pow(valor_B,2);
    double arearetangulo = valor_A * valor_B;
    System.out.printf("Área do triângulo: %.3f%n", areaTriangulo);
    System.out.printf("Área do círculo: %.3f%n", areacirculo);  
    System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
    System.out.printf("Área do quadrado: %.3f%n", areaquadrado);
    System.out.printf("Área do retângulo: %.3f%n", arearetangulo);
}
}
