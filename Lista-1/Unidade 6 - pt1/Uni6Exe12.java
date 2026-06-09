import java.util.Scanner;
public class Uni6Exe12 {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

// ler a quantidade de valores
int n;
do {
    System.out.println("Informe a quantidade de números (máximo 20): ");
    n = teclado.nextInt();
} while (n > 20);

// criar um vetor e ler os valores
int vetor[] = new int[n];
for (int cont = 0; cont < n; cont++){
    System.out.println("Digite o valor da posição "+ cont + " (entre 50 e 70): ");
    do{ 
        vetor[cont] = teclado.nextInt();
    } while (vetor[cont] < 50 || vetor[cont] > 70); // o || é o ou
}

//criar o vetor de quantiedades e inicializar todas as posições com zero
int quantidade[] = new int[21]; // 21 porque tem o 50...70
for (int cont = 0; cont < n; cont++) {
    quantidade[cont] = 0;
}

// contar a quantidade de números
for (int cont = 0; cont < n; cont++) {
    // verificar a posição do número
    int posição = vetor [cont] - 50;
    // incrementar a quantidade
    quantidade[posição]++;
}

//escrever o histograma
System.out.println("Histograma:");
for (int numero = 50; numero <= 70; numero++){ // o numero é para escrever o número do histograma, o cont é para escrever os asteriscos
    System.out.printf("%d: ", numero);
    for (int cont = 0; cont < quantidade[numero - 50]; cont++){ // o numero - 50 é para acessar a posição correta do vetor de quantidades
        System.out.print("*"); // o print é para escrever na mesma linha, o printf é para escrever na mesma linha e formatar a saída
    }
    System.out.printf("\n"); // o printf é para escrever na mesma linha e formatar a saída, o \n é para pular a linha
}



}
}
//Uni6Exe12.java - Escreva um programa para ler N números (Máximo 20) cujos valores estejam entre 50 e 70. Ao final,
//  seu programa deverá exibir um histograma horizontal mostrando com asteriscos a quantidade de vezes que cada número foi lido. 
// A ilustração a seguir mostra as quatro primeiras linhas do histograma, para o caso de o número 50 ter sido lido 3 vezes, o número 51, nenhuma vez, o 52, 
// sete vezes e o 53 duas vezes. 50: *** 51: 52: ******* 53: **