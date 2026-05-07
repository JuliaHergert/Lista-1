import java.util.Scanner;
public class Uni6Exe2 {
public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

// definir o valor
float vetor[] = new float[12];

// inicializar a soma
float soma = 0;

// ler os valores
for(int cont=0; cont<=11; cont++){
 
  // ler o valor na posição cont
    System.out.println("Digite o valor da posição " + cont);
    vetor[cont] = teclado.nextFloat();

    // somar o valor lido com a soma
    soma = soma + vetor[cont];
}
// calcular a média
float media = soma / 12;

}
}
