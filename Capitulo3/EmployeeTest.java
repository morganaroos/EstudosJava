package Capitulo3;

public class EmployeeTest {

    public static void main( String[] args){

        Employee pessoa1 = new Employee( "Geraldo", "Do Rio", -7.00);
        Employee pessoa2 = new Employee( "Ana", "Maria Braga", 30000.00);

        System.out.printf( "\nSalario mensal da pessoa 1 é: $%.2f\n", pessoa1.getSalarioMensal() );
        System.out.printf( "\nSalario mensal da pessoa 2 é: $%.2f\n", pessoa2.getSalarioMensal());

        // pessoa2.setSalarioMensal(-4);

       // System.out.printf( "\nSalario mensal da pessoa 2 é: $%.2f\n", pessoa2.getSalarioMensal());

        pessoa1.getAumento10();
        pessoa2.getAumento10();

        System.out.printf( "\nSalario mensal com aumento da pessoa 1 é: $%.2f\n", pessoa1.getSalarioMensal() );
        System.out.printf( "\nSalario mensal com aumento da pessoa 2 é: $%.2f\n", pessoa2.getSalarioMensal());
    }
}
