
import java.util.Scanner;
public class Uni6Exe6 {
public static void main(String[] args) {
      
Scanner teclado = new Scanner (System.in);

    //definir o tamanho do vetor
    System.out.println("Informe o tamanho do vetor");
    int n = teclado.nextInt();

    //criar o vetor com o tamanho n
    float vetor[] = new float[n];

    //ler os valores e armazenar no vetor
    for (int cont = 0; cont < n; cont++){
        System.out.println("Digite o valor da posição "+ cont);
        vetor[cont] = teclado.nextFloat();
    }

    //variavel para indicar se o valor foi encontrado
    boolean achou = false;

    //ler o valor a ser encontrado
    System.out.println("Digite o valor a ser pesquisado");
    float valor = teclado.nextFloat();

    //percorrer o vetor para procurar o valor
    for(int cont = 0; cont < n; cont++){

        //verificar se o valor da posição cont é o procurado
        if(vetor[cont] == valor){
            achou = true;
            break; //interromper a pesquisa     !!!!!!!!Atenção!!!!!!!!! se no dia da prova se quiser saber quantos tem não usa o break
        }

    }

    // informar se o valor existe ou não
    System.out.println(achou ? "O valor está no vetor" : "o valor não está no vetor");

    
    }

}
