import java.util.Scanner;

public class Uni4Exe02 {
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);

 int valor = teclado.nextInt();

 //testar se é par ou impar
 if (valor % 2 == 0) {

System.out.println("O número é par: ");
 }else{ 
    System.out.println("O número é impar:");

 }
}
}
