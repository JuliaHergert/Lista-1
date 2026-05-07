import java.util.Scanner;
public class Uni4Exe22 
{

public static void main (String[] args) 
{
    Scanner teclado = new Scanner (System.in);
    //ler a opcao
    System.out.println("Digite a opção 1 e 4");
    int opcao = teclado.nextInt();
    //selecionar opção. obs. quando for case é sempre : e não =
    switch (opcao)
    {
        case 1 :
             System.out.println("Bacharel em ciência da computação");
        break; 

        case 2 : 
            System.out.println("Licenciatura em computação");
        break;

        case 3 : 
            System.out.println("Bacharel em Sistemas da informação");
        break;

        case 4 : 
            System.out.println("Bacharel em Ciência de Dados");
        break;
        
        default:
            System.out.println("Opção inválida"); 
        break;
    }
        teclado.close();

}
}
