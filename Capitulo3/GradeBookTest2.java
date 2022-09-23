package Capitulo3;

import java.util.Scanner;

public class GradeBookTest2 {

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        GradeBook2 myGradeBook = new GradeBook2();

        System.out.printf( "Retorno será: %s\n", myGradeBook.getCourseName() );

        System.out.println( "Digite o nome do curso: ");
        String theName = input.nextLine();
        myGradeBook.setCourseName( theName );

        myGradeBook.displayMessage();
    }
}
