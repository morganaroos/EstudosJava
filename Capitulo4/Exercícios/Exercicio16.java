package Capitulo4.Exercícios;

public class Exercicio16 {
    public static void main( String[] args){

        int y;
        int x = 1;
        int total = 0;

        while ( x <= 10){

            y = x * x;
            System.out.println( y );
            total += y;
            ++x;
        }

        System.out.printf( "Total is %d\n", total);
    }
}
