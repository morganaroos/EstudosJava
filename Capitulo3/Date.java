package Capitulo3;

public class Date {

    private int mes;
    private int dia;
    private int ano;

    public Date( int mes1, int dia1, int ano1){

        mes = mes1;
        dia = dia1;
        ano = ano1;
    }

    public void setMes( int mes1 ){

        mes = mes1;
    }

    public void setDia( int dia1 ){

        dia = dia1;
    }

    public void setAno( int ano1){

        ano = ano1;
    }

    public int getMes(){

        return mes;
    }

    public int getDia(){

        return dia;
    }

    public int getAno(){

        return ano;
    }

    public String displayDate(){

        return String.format( "%d/%d/%d", getDia(), getMes(), getAno() );
    }
}
