import java.util.Scanner;
public class Exe25Uni5 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    byte pontoD = 0;
    byte pontoE = 0;

    // controla se o jogo teve vencedor
    boolean vencedor = false;
    
    do{
        // ler o ponto
        char ponto = teclado.next().charAt(0);
        // transformar para maiusculo
        ponto = Character.toUpperCase(ponto);
        
        //marcar o ponto
        switch (ponto){
          case 'D' : pontoD++; break;
          case 'E' : pontoE++; break;
        }
        // informar o placar parcial
        System.out.printf("D %d x %d E/n", pontoD, pontoE);
        if ((pontoD >= 7) && (pontoD - pontoE >= 2)){
            System.out.println("Jogador da Direita venceu");
            vencedor = true;
        }else{
        System.out.printf("D %d x %d E/n", pontoD, pontoE);
        if ((pontoE >= 7) && (pontoE - pontoD >= 2)){
        System.out.println("Jogador da Esquerda venceu");
        vencedor = true;
        }
    }   
} while (!vencedor);

}
}
