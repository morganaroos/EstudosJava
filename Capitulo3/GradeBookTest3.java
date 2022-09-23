package Capitulo3;

public class GradeBookTest3 {

    public static void main( String[] args ){

       GradeBook3 gradeBook1 = new GradeBook3("Curso 1", "Prof 1");
       GradeBook3 gradeBook2 = new GradeBook3("Curso 2", "Prof 2");

       System.out.printf("Primeiro: %s, %s\n", gradeBook1.getCourseName(), gradeBook1.getInstrutorNome());
       System.out.printf("Segundo: %s, %s\n", gradeBook2.getCourseName(), gradeBook2.getInstrutorNome());
       System.out.println();

       gradeBook1.displayMessage();
       gradeBook2.displayMessage();

    }
}
