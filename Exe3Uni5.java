import java.util.Scanner;
public class Exe3Uni5 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    //ler a quantiedade de abastecimento
    System.out.println("Informe o número de abastecimentos");
    int abastecimentos = teclado.nextInt();

    // inicializar a soma do combustivel  e quilometragem
    float somaQuilometragem = 0;
    float somaCombustivel = 0;

    // repetir para mais abastecimentos
    for (int cont = 0; cont < abastecimentos; cont++){

        System.out.println("Informe a quilometragem");
        float quilometragem = teclado.nextFloat();
    
        System.out.println("Informe a quantiedade de combustível");
        float combustivel = teclado.nextFloat();

        // informar o consumo
        System.out.printf("Consumo = %.2f\n", quilometragem / combustivel);

        // somar a quilometragem e o combustivel total da viagem
        somaQuilometragem += quilometragem;
        somaCombustivel += combustivel;


    }

    System.out.printf("Consumo total = %.2f\n", somaQuilometragem / somaCombustivel);
}
}
