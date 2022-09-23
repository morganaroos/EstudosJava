package Capitulo4.Exercícios;
import java.util.Scanner;

public class Exercicio18 {

    public static void main( String[] args){

        Scanner input =  new Scanner( System.in );

        int conta;
        int saldoInicial;
        int totalDespesas;
        int totalCreditos;
        int limiteCredito;
        int saldoAtual;

        saldoAtual = 0;

        System.out.print( "Por favor, digite o número da conta: " );
        conta = input.nextInt();

        System.out.print( "Por favor, digite o saldo inicial: " );
        saldoInicial = input.nextInt();

        System.out.print( "Por favor, digite o total de despesas: " );
        totalDespesas = input.nextInt();

        System.out.print( "Por favor, digite o total de crédito fornecido ao cliente: " );
        totalCreditos = input.nextInt();

        System.out.print( "Por favor, digite o limite de crédito do cliente: " );
        limiteCredito = input.nextInt();

        saldoAtual = saldoInicial + totalDespesas - totalCreditos;

        System.out.printf( "\nO saldo atual para a conta número %d é de R$%d,00.", conta, saldoAtual );

        if( saldoAtual > limiteCredito ){
            System.out.println( "\nLimite de crédito excedido!" );
        }

    }
}
