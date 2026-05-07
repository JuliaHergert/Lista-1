import java.util.Scanner;
    public class Simulado {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);

        //entrada do número de vezes que a situação da porta foi verificada
        System.out.println("Quantas vezes a situação da porta foi verificada?");
        int n = teclado.nextInt(); //entrada do número de vezes que a porta ficou aberta
        int totalAberto = 0; //conta o número de vezes que a porta ficou aberta
        int sequencialaberto = 0; // soma a quantidade de tempo que a porta ficou aberta
        int maiorSequenciaAberto = 0; //guarda a maior sequência de tempo que a porta ficou aberta
        int situacaoPorta = 0; //variável para armazenar a situação anterior da porta (1 para aberta, 0 para fechada)
        

        
         
        for(int c = 1; c <= n; c++ ){

            int portaAntes = situacaoPorta; //atualizar a situação anterior da porta para a situação atual

            System.out.println("Como está a porta? (1) Aberta, (0) Fechada");
            int situacao = teclado.nextInt(); //entrada da situação da porta (1 para aberta, 0 para fechada)
            
            //verificar se a porta foi aberta 
            if (situacao == 1 && portaAntes == 0){
                totalAberto++;
            } 
                //verificar se a porta está aberta para contar o tempo 
                if (situacao == 1){
                sequencialaberto += 5;
              
              
                if(sequencialaberto > maiorSequenciaAberto){
                    maiorSequenciaAberto = sequencialaberto; //atualizar a maior sequência de tempo que a porta ficou aberta
                }
            } else{
                sequencialaberto = 0; //se a porta estiver fechada, resetar a contagem de tempo que a porta ficou aberta
            }
         //atualizar a situação anterior da porta para a situação atual
            portaAntes = situacao; 

        }
        //o número de vezes que a situação da porta foi verificada é o número de vezes que a porta ficou aberta
        System.out.println("Total de vezes que foi aberta: " + totalAberto);
        //o tempo total que a porta ficou aberta é o número de vezes que ela ficou aberta multiplicado por 5
        System.out.println("A maior sequência de tempo que a porta ficou aberta é: " + maiorSequenciaAberto + " segundos");

        teclado.close();
    }
    }    


