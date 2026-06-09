import java.util.Scanner;
public class Uni6Exe11 {
public static void main(String[] args) {
    
Scanner teclado = new Scanner (System.in);

int vetor1[] = new int[10];
int vetor2[] = new int[10];
int vetor3[] = new int[10];

for(int cont1=0; cont1 < 10; cont1++){
    System.out.println("Informe o valor do vetor 1" + cont1);
    vetor1[cont1] = teclado.nextInt();
}
for(int cont2=0; cont2 < 10; cont2++){
    System.out.println("Informe o valor do vetor 2" + cont2);
    vetor2[cont2] = teclado.nextInt();
} 

// Comparar os vetores
        for (int cont3 = 0; cont3 < 10; cont3++) {

            if (vetor1[cont3] == vetor2[cont3]) {
                vetor3[cont3] = 1;
            } else {
                vetor3[cont3] = 0;
            }


}
// Mostrar vetor 3
        System.out.println("Vetor 3:");

        for (int cont3 = 0; cont3 < 10; cont3++) {
            System.out.println(vetor3[cont3]);
        }

        teclado.close();
}
}


//Uni6Exe11.java - Construa um programa para ler dois vetores contendo 10 números inteiros e depois crie um terceiro vetor cujo conteúdo de cada posição seja: 1,
//  se o número armazenado em uma posição do 1º vetor for o mesmo armazenado na posição respectiva do 2º vetor, e 0, caso contrário.

