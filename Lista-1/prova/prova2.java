import java.util.Scanner;
public class prova2 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);


    // definir o tamanho do vetor
    // QUESTAO A
    System.out.println("Informe a quantidade de dias a ser analisada");
    int n = teclado.nextInt();


    double nivelRio[] = new double[n];
    int quantChuva[] = new int[n];
    //double aumento=0;
    double dif=0;
    for (int i = 0; i < nivelRio.length; i++){


        // QUESTAO B
        System.out.println("Informe quantos metros o rio subiu");
        nivelRio[i] = teclado.nextDouble();
        

        //QUESTAO C
        System.out.println("Informe a quantidade de chuvas");
        quantChuva[i] = teclado.nextInt();
    }
    
    System.out.println("Informe o dia inicial");
    int diaInicial = teclado.nextInt();

    System.out.println("Informe o dia final");
    int diaFinal = teclado.nextInt();


    // QUESTAO D

    //for(int i = 0; i < nivelRio.length; i++){
     //   dif = nivelRio[i]- nivelRio[i];
     //   if(nivelRio[i] > nivelRio[i-1]){
      //  dif++;
      //  }
 //   }
  









    // QUESTAO E
    //  for (int i = 0; i < nivelRio.length; i++){
  //    if(nivelRio[i] > nivelRio[i-1]){
      
   //   }   
   //    }

 //System.out.println("Maior período consecutivo do rio acima do ideal:" + aumento + " dias.");









 // QUESTAO F
 
 int posicao = 0;

   double diferenca = 0;
  for(int i = 0; i < nivelRio.length; i++){
   diferenca = (nivelRio[2] ) -(nivelRio[6] );
 
 }
 System.out.printf("diferença"+ diferenca);



    
   
   // for(int cont = 0; cont < n; cont++){
    //    diaInicial = posicao=cont;
        //verificar se o valor da posição cont é o procurado
   //     if(nivelRio[cont] == diaInicial + posicao){
          
    //    }

  //  }
    
    
    
  //  for(int cont = 0; cont < n; cont++){
  //      diaFinal = posicao=cont;
 // verificar se o valor da posição cont é o procurado
  //    if(nivelRio[cont] == diaFinal + posicao){    
   //     }
  //  }

   // double diferenca=0;
  //  diferenca = (diaInicial - diaFinal);
  //  System.out.println("Diferença: "+ diferenca);


   // for(int i = 0; i < diferença.length; i++){
      //  nivelRio[i] = (diaInicial - diaFinal);
   // }
   
}
}


