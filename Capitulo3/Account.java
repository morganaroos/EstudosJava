package Capitulo3;

public class Account {

    private double balanco;

    public Account( double inicialBalanco ){

        if  ( inicialBalanco > 0.0)
            balanco = inicialBalanco;
    }

    public void credit( double quantia ){

        balanco = balanco + quantia;
    }

    public void debit(double valor){

        if( valor > balanco ){
            System.out.println("Quantia de débito excedeu o saldo da conta");
        }

        if ( valor <= balanco ){
            balanco = balanco - valor;
        }

    }

    public double getBalanco(){
        return balanco;
    }
}
