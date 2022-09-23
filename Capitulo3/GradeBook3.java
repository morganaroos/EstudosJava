package Capitulo3;

public class GradeBook3 {

    private String courseName;
    private String instrutorNome;

    public GradeBook3( String name, String instrutor ){

        courseName = name;
        instrutorNome = instrutor;
    }

    public void setCourseName( String name ){

        courseName = name;
    }

    public void setInstrutorNome( String instrutor ){

        instrutorNome = instrutor;
    }

    public String getCourseName(){

        return courseName;
    }

    public String getInstrutorNome(){

        return instrutorNome;
    }

    public void displayMessage(){

        System.out.printf("Welcome to the GradeBook for \n%s! Thsis course is presented by: %s\n", getCourseName(), getInstrutorNome());
    }

}
