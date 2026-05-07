import java.util.Scanner;

public class exe12uni2 {
    public static void main(String[] args) {

    int x1, y1, x2, y2; // coordenadas dos pontos A(x1, y1) e B(x2, y2)

    Scanner teclado = new Scanner (System.in);

// Decomposição de contas para calcular a distância entre dois pontos no plano cartesiano

   System.out.print("Informe o valor de x1:");
    x1 = teclado.nextInt();
    System.out.print("Informe o valor de x2:");
    x2 = teclado.nextInt();
    double distancia = (x2 - x1)*(x2-x1); //elevado a 2, como é só até a 2 não precisou chamar o Math.pow

    System.out.print("Informe o valor de y1:");
    y1 = teclado.nextInt();
    System.out.print("Informe o valor de y2:");
    y2 = teclado.nextInt();
    distancia = (y2 - y1)*(y2-y1);
    distancia = Math.sqrt(distancia);
    System.out.println("A distância entre os pontos é: " + distancia);
    }

}
