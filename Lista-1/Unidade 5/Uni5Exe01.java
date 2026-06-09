import java.util.Scanner;
public class Uni5Exe01 {
public static void main(String[] args) {
    
Scanner teclado = new Scanner (System.in);

//repetir para 20 números cont = contador
 for(int cont = 1; cont <= 20; cont++ ){
  // ler o numero
 System.out.println("Digite um número inteiro maior do que 0");
 int numero = teclado.nextInt();

 // testar se o número é divisível por 2
 if (numero % 2 == 0) {
    System.out.println("Par");
 }else {
    System.out.println("Impar");

 }
 }
 teclado.close();
}
}
