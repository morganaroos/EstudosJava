package Capitulo4.Exercícios;
import java.util.Scanner;

public class Exercicio17 {
    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        int quilometrosDirigidos;
        int quantidadeCombustivel;
        double quilometrosPorLitro;
        int totalQuilometragem;
        int totalCombustivel;
        int tanqueCheio;

        totalCombustivel = 0;
        totalQuilometragem = 0;
        tanqueCheio = 0;

        System.out.print( "Digite a quilometragem dirigida ou -1 para sair: " );
        quilometrosDirigidos = input.nextInt();

        while ( quilometrosDirigidos != -1 ){
            System.out.printf( "Digite a quantidade de combustível: " );
            quantidadeCombustivel = input.nextInt();
            tanqueCheio += 1;
            totalQuilometragem += quilometrosDirigidos;
            totalCombustivel += quantidadeCombustivel;

            if( quantidadeCombustivel != 0 ){
                quilometrosPorLitro = (double) quilometrosDirigidos / quantidadeCombustivel;
                System.out.printf( "\nA quilometragem por litro feita foi: %.2f Km/L", quilometrosPorLitro );
            }

            System.out.printf( "\nA quilometragem total percorrida até o momento foi de %d Km", totalQuilometragem );
            System.out.printf( "\nA quantidade total de combústivel utilizado até o momento é %d L", totalCombustivel );
            System.out.printf( "\nA quantidade de vezes que o tanque foi cheio é: %d", tanqueCheio );

            System.out.println( "\n" );
            System.out.print( "\nDigite a quilometragem dirigida ou -1 para sair: " );
            quilometrosDirigidos = input.nextInt();
        }
    }


}
