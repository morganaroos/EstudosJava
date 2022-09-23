package Capitulo3;

public class Invoice {

    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Invoice( String number, String descri, int quantidade, double preco ){

        numero = number;
        descricao = descri;
        quantidadeComprada = quantidade;
        precoUnitario = preco;
    }

    public void setNumero( String number ){

        numero = number;
    }

    public void setDescricao( String descri ){

        descricao = descri;
    }

    public void setQuantidadeComprada( int quantidade ){

        quantidadeComprada = quantidade;
    }

    public void setPrecoUnitario( double preco ){

        precoUnitario = preco;
    }

    public String getNumero(){

        return numero;
    }

    public String getDescricao(){

        return descricao;
    }

    public int getQuantidadeComprada(){

        return quantidadeComprada;
    }

    public double getPrecoUnitario(){

        return precoUnitario;
    }

    public double getInvoiceAmount(){

        if( quantidadeComprada < 0 )
            quantidadeComprada = 0;

        if( precoUnitario < 0 )
            precoUnitario = 0;

        return quantidadeComprada * precoUnitario;

    }
}
