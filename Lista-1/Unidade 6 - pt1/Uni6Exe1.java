import java.util.Scanner;
public class Uni6Exe1 {

    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);

   // definir um vetor com 10 elementos
    int X[]  = new int[10];

    for(int cont=0; cont<=9; cont++){
        System.out.println("Digite o valor: ");
        X[cont] = teclado.nextInt();
    }
    //escrever os números na ordem inversa
    for(int cont=9; cont>=0; cont--){
        System.out.println(X[cont]);
    }
}
}


