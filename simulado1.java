import java.util.Scanner;
public class Exe25Uni5 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    byte A = 0;
    byte F = 0;

    // controla se o jogo teve vencedor
    boolean aberta = false;
    
    do{
        char porta= teclado.next().charAt(0);
        
        switch (porta){
          case 'A' : A++; break;
          case 'F' : F++; break;
        }
        // informar o placar parcial
        System.out.printf("D %d x %d E/n", A, F);
        if ((A) && (F - A >= 2)){
            System.out.println("Aberta");
            aberta= true;
        }else{
        System.out.printf("D %d x %d E/n", F, A);
        if ((A>= 7) && (A - F >= 2)){
        System.out.println("Jogador da Esquerda venceu");
        aberta = true;
        }
    }   
} while (!aberta);

}
}