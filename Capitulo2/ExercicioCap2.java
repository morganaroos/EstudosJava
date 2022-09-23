package Capitulo2;

import java.util.Scanner;

public class ExercicioCap2 {

    public static void main(String[] args) {
//        Ex23.main();
//        Ex25.main();
//        Ex28.main();
//        Ex214.main();
//        Ex215.main();
//        Ex216.main();
//        Ex217.main();
        Ex233.main();
    }

    public static class Ex23 {
        public static void main() {

            Scanner input = new Scanner(System.in);

            // a):
            int c;
            int thisIsAVariable;
            int q76354;
            int number;

            // b):
            // System.out.print("Digite um número inteiro: ");
            // number = input.nextInt();

            // d), e) e f):
            System.out.println("This is a Java program");
            System.out.println("This is a Java \nprogram");
            System.out.printf("%s\n%s\n", "This is a Java", "program");

            // g):
            // if ( number != 7)
            //    System.out.println( "The variable number is not equal to 7" );


        }
    }

    public static class Ex25 {
        public static void main() {

            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int number3;
            int result;

            System.out.print( "Insira o primerio inteiro: " );
            number1 = input.nextInt();

            System.out.print( "Insira o segundo inteiro: ");
            number2 = input.nextInt();

            System.out.print( "Insira o terceiro inteiro: " );
            number3 = input.nextInt();

            result = number1 * number2 * number3;

            System.out.printf( "O resultado é %d\n", result);

        }
    }

    public static class Ex28 {
        public static void main() {

            System.out.println("Enter an integer");

            int a = 2;
            int b = 2;
            int c;

            c = a * b;
            System.out.printf( "A variável C é %d\n ", c);

        }
    }

    public static class Ex214 {
        public static void main() {

            System.out.println("12 34");
            System.out.print("12 34");
            System.out.printf("\n%s %s","12", "34");

        }
    }

    public  static class Ex215 {
        public static void main() {

            Scanner input = new Scanner( System.in );

            int number1;
            int number2;
            int soma;
            int produto;
            int subtracao;
            int divisao;

            System.out.print( "Digite o primeiro inteiro: " );
            number1 = input.nextInt();

            System.out.print( "Digite o segundo inteiro:  " );
            number2 = input.nextInt();

            soma = number1 + number2;
            produto = number1 * number2;
            subtracao = number1 - number2;
            divisao = number1 / number2;

            System.out.printf( "\nO resultado da soma é: %d \nO resultado do produto é: %d " +
                    "\nO resultado da subtração é: %d \nO resultado da divisao é: %d", soma, produto, subtracao, divisao);

        }
    }

    public static class Ex216 {
        public static void main() {

            Scanner input = new Scanner( System.in );

            int number1;
            int number2;

            System.out.print( "Digite o primeiro inteiro: " );
            number1 = input.nextInt();

            System.out.print( "Digite o segundo inteiro:  " );
            number2 = input.nextInt();

            if( number1 > number2)
                System.out.printf( "\n%d is larger", number1 );

            if( number2 > number1)
                System.out.printf( "\n%d is larger", number2 );

            if( number1 == number2)
                System.out.println( "These numbers are equal" );

        }
    }

    public static class Ex217 {
        public static void main() {

            Scanner input = new Scanner( System.in );

            int number1;
            int number2;
            int number3;
            int soma;
            int media;
            int produto;

            System.out.print( "Digite o primeiro inteiro: " );
            number1 = input.nextInt();

            System.out.print( "Digite o segundo inteiro:  " );
            number2 = input.nextInt();

            System.out.print( "Digite o terceiro inteiro:  " );
            number3 = input.nextInt();

            soma = number1 + number2 + number3;
            media = (number1 + number2 + number3) / 3;
            produto = number1 * number2 * number3;

            System.out.printf( "\nO resultado da soma é: %d \nO resultado da média é: %d " +
                    "\nO resultado do produto é: %d", soma, media, produto);

        }
    }

    public static class Ex233 {
        public static void main() {

            Scanner input = new Scanner( System.in );

            float peso;
            float altura;
            float resultado;

            System.out.print( "Digite o seu peso em quilogramas: " );
            peso = input.nextFloat();

            System.out.print( "Digite a sua altura em metros: " );
            altura = input.nextFloat();

            resultado = peso / (altura * altura);

            System.out.printf( "\nSeu IMC é de %f \nUnderweught: less than 18.5" +
                    "\nNormal: between 18.5 and 24.9 \nOverweight: between 25 and 29.9 " +
                    "\nObese: 30 or greater", resultado );

        }
    }
}
