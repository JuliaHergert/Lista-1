import java.util.Scanner;
public class Prova {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);


    // ler as variáveis
    double altura, diametro;
   


    System.out.println("Digite a altura da árvore"); // ler altura
    altura = teclado.nextDouble();

    System.out.println("Digite o diametro da árvore"); // ler diametro
    diametro = teclado.nextDouble();
    
    int raquiticas = 0;
    int quantiedadeArvores = 0;
    double volume = teclado.nextDouble();
    double maior = 0;
    double percentual = 0;
    

  

    do{
     
    float raio = teclado.nextFloat();
     // calcular raio
     raio = (float) (diametro / 2);

     // calcular volume
      volume = Math.PI * altura * (raio*raio);
     

     // calcular árvores raquíticas 
     if (altura <= 2.0 && diametro <= 0.5){
        raquiticas++;
     
     }
     quantiedadeArvores++;
     percentual = raquiticas / quantiedadeArvores*100;

     // calcular a maior árvore e ver o volume de árvores empatadas
     
     if  (altura >= maior){
    maior++;

     }

     double diametroMedio = teclado.nextDouble();
     diametroMedio  = diametro / 2;

    System.out.printf("Volume: %.4f\n", volume);
     System.out.println();
     System.out.printf("Percentual das árvores raquíticas:  %.2f\n", percentual);
     System.out.println();
     System.out.printf("A maior árvore é: ", maior);
     System.out.println();
     System.out.printf("Diametro médio é: %.2f\n", diametroMedio);

    
 } while (altura != 0);

 teclado.close();
}
}
