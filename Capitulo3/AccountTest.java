package Capitulo3;
import java.util.Scanner;

public class AccountTest {
    public static void main( String[] args ){

        Account conta1 = new Account( 50.00 );
        Account conta2 = new Account( -7.53 );

        System.out.printf( "Conta1 balanco: $%.2f \n", conta1.getBalanco());
        System.out.printf( "Conta2 balanco: $%.2f \n", conta2.getBalanco());

        Scanner input = new Scanner( System.in );
        double depositoQuantia;
        double saqueQuantia;

        System.out.print( "Digite a quantia de deposito na conta1: ");
        depositoQuantia = input.nextDouble();
        System.out.printf( "\nAdicionando $%.2f no balanco da conta1...\n\n", depositoQuantia );
        conta1.credit( depositoQuantia );

        System.out.printf( "Balanco conta1: $%.2f\n", conta1.getBalanco() );
        System.out.printf( "Balanco conta2: $%.2f\n\n", conta2.getBalanco() );

        System.out.printf( "Digite a quantia de deposito na conta2: " );
        depositoQuantia = input.nextDouble();
        System.out.printf("\nAdicionando $%.2f no balanco da conta2...\n\n", depositoQuantia);
        conta2.credit( depositoQuantia );

        System.out.printf( "Balanco conta1: $%.2f\n", conta1.getBalanco() );
        System.out.printf( "Balanco conta2: $%.2f\n\n", conta2.getBalanco() );

        System.out.printf( "Digite a quantia de sacar na conta2: " );
        saqueQuantia = input.nextDouble();
        System.out.printf("\nDebitando $%.2f no balanco da conta2...\n\n", saqueQuantia);
        conta2.debit( saqueQuantia );

        System.out.printf( "Balanco conta1: $%.2f\n", conta1.getBalanco() );
        System.out.printf( "Balanco conta2: $%.2f\n\n", conta2.getBalanco() );
    }
}
