// Figura 2.7: Addition.java
// Programa de adição que exibe a soma de dois números

import java.util.Scanner; // importa da api java.util a classe Scanner

public class Addition{
    public static void main( String[] args){
        Scanner input = new Scanner( System.in);   // Tipo: Scanner; var: input = novo objeto Scanner( ler bytes digitados pelo usuário)

        int number1;   // variável do tipo num inteiros de nome number1.
        int number2;   // variável do tipo num inteiros de nome number2.
        int sum;   // variável do tipo num inteiros de nome sum.

        System.out.print( "Enter first integer: ");   // mostra na tela a string e o próximo valor será add depois dos :
        number1 = input.nextInt();   // método nextInt() é utilizado para obter um inteiro digitado pelo usuáio que aparecerá depois dos :

        System.out.print( "Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;   // soma as variáveis

        System.out.printf( "Sum is %d\n", sum );   // mostra o valor da soma


    }
}