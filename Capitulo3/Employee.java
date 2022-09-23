package Capitulo3;

public class Employee {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Employee( String nome, String sobre, double salario ){

        primeiroNome = nome;
        sobrenome = sobre;

        if ( salario > 0 )
            salarioMensal = salario;
    }

    public void setPrimeiroNome( String nome ){

        primeiroNome = nome;
    }

    public void setSobrenome( String sobre ){

        sobrenome = sobre;
    }

    public void setSalarioMensal( double salario ){

        if ( salario > 0 )
            salarioMensal = salario;
    }

    public String getPrimeiroNome(){

        return sobrenome;
    }

    public String getSobrenome(){

        return sobrenome;
    }

    public double getSalarioMensal(){

        return salarioMensal;
    }

    public void getAumento10(){

        if(salarioMensal > 0)
            salarioMensal += salarioMensal * 0.1;
    }
}
