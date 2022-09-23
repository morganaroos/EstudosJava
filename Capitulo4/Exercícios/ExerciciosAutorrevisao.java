package Capitulo4.Exercícios;

public class ExerciciosAutorrevisao {
    public static void main( String[] args ){

        double x = 1;
        double y = 1;
        double z = 1;

        z += x++ + y;

        System.out.printf( "Z é %.2f", z);

        float a = 1;
        float total = 2;
         a = a--;
         total -= a;

         System.out.printf("\nTotal é %.2f", total);

         int sum;
         int b;

         b = 1;
         sum = 0;
         sum += b;

         System.out.printf( "\nA soma é: %d ", sum );

         while( sum <= 10 ){
             sum += 1;
         }

         System.out.printf( "\nSoma é: %d", sum );

         int product = 5;
         int c = 5;

         product *= c++;

         System.out.printf( "\nProduct é: %d, \nC é: %d", product, c);

    }
}
