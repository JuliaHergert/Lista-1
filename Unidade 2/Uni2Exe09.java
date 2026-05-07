import java.util.Scanner;

public class Uni2Exe09 {
public static void main(String[] args) {
int cod1, num1, cod2, num2;
double valor1, valor2, total;



//Leitura    
Scanner teclado = new Scanner(System.in);
System.out.println("Informe o código da peça 1:");
cod1 = teclado.nextInt();

System.out.println("Informe o número de peças 1:");
num1 = teclado.nextInt();

System.out.println("Informe o valor unitário da peça 1:");
valor1 = teclado.nextDouble();

System.out.println("Informe o código da peça 2:");
cod2 = teclado.nextInt();

System.out.println("Informe o número de peças 2:");
num2 = teclado.nextInt();

System.out.println("Informe o valor unitário da peça 2:");
valor2 = teclado.nextDouble();


total = (num1 * valor1) + (num2 * valor2);

System.out.printf("Valor a pagar: %.2f%n", total);

    }
}
/*Uni2Exe08 [1][1010]
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.*/
