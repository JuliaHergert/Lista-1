import java.util.Scanner;
public class Uni4Exe6 {


public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);

//Leitura de caracter no Java: usar o charAt(0) para ler apenas um caracter
 System.out.println("Digite uma letra: ");
char letra = teclado.next().charAt(0);

// converter a letra para a maiúscula
letra = Character.toUpperCase(letra);

//testar a variável
if (letra == 'M') {
    System.out.println("Masculino");

} else {
    if (letra == 'F') {
        System.out.println("Feminino");

    } else {
        if (letra == 'I') {
            System.out.println("Não informado");
        
        } else {
            System.out.println("Letra inválida");
        }
    }
}
}
}