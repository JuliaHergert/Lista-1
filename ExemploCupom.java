import java.util.Scanner;

public class ExemploCupom {
public static void main (String[] args){
Scanner teclado = new Scanner (System.in);


System.out.println("Digite o valor do produto:");
double valorProduto = teclado.nextDouble();
System.out.println ("Tem cupom?");
boolean temCupom = teclado.nextBoolean();
double desconto = 0.0;


//verificando se tem cupom
if (temCupom){

    //calcular o desconto de 10%
    desconto = valorProduto * 0.10;

    //testar o limite de desconto
    if (desconto > 15.0){
        desconto = 15.0;

 
}
}
   System.out.println("Valor a pagar: " + (valorProduto - desconto));
    //fechar o scanner

    teclado.close();
}
}
