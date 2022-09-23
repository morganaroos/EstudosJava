package Capitulo3;
import java.util.Scanner;

public class InvoiceTest {

    public static void main( String[] args ){

        Invoice fatura = new Invoice( "38", "sapato", 0, 240.99);

        Scanner input = new Scanner(System.in);
        int quantidade;

        System.out.print("Digite a quantidade de intem: ");
        quantidade = input.nextInt();
        fatura.setQuantidadeComprada( quantidade );

        System.out.printf( "\nO valor da fatura é de: R$%.2f\n\n.", fatura.getInvoiceAmount());

    }
}
