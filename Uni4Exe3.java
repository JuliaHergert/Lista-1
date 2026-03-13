import java.util.Scanner;

public class Uni4Exe3 {
public static void main(String[] args) {
    
Scanner teclado = new Scanner (System.in);

//entrada dos dois números (lembrando: sempre ter mensagem e depois a leitura)
System.out.println("Digite o primeiro valor:");
int valor1 = teclado.nextInt();
System.out.println("Digite o segundo valor:");
int valor2 = teclado.nextInt();

//descobrir o maior entre os dois
if(valor1 > valor2){
    System.out.println(valor1 + " maior que " + valor2);

}else{
 System.out.println(valor2 + " maior que " + valor1);

}
teclado.close();
}
}
