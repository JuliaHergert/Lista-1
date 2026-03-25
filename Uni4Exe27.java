import java.util.Scanner;

public class Uni4Exe27 {
public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);

//leitura dos dados
System.out.println("Digite a hora e minutos de chegada");
int horasChegada = teclado.nextInt();
int minChegada = teclado.nextInt(); 

System.out.println("Digite horas e minutos da partida");
int horasPartida = teclado.nextInt();
int minPartida = teclado.nextInt();

//calcular os minutos permanentes no estacionamento
int minutosTotais = (horasPartida * 60 + minPartida) - 
                    (horasChegada * 60 + minChegada);
                    
//calcular horas e minutos de estacionamento
int minutos = minutosTotais % 60;
int horas = minutos / 60;

// testar quantas horas deve ser pagas
int horasApagar = 0;
if( horas == 00){
    horasApagar = 1;
} else {
    if (minutos < 30) {
        horasApagar = horas;
    } else {
        horasApagar = horas + 1;
    }
}
// verificar valor a pagar
switch (horasApagar) {
    case 1 :
    case 2 : System.out.printf("Valor a pagar = %f",
        horasApagar * 5.00);
        break;
    case 3 :
    case 4 : System.out.printf("Valor a pagar = %f",
        10 + (horasApagar - 2) * 7,5);
        break;
    default :
         System.out.printf("Valor a pagar = %f", 
            25 + (horasApagar - 4 ) * 10.0); 
}
 System.out.printf("Ficou estacionado %d:%d",
    horas, minutos);
 


}
}
