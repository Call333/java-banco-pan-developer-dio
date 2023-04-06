package edu.calebe.exceptioncustomizada;

public class DivisaoNaoExataException extends Exception{
    private int numerador;
    private int denominador;

    DivisaoNaoExataException(String mes, int num, int den){
        super(mes);
        this.numerador = num;
        this.denominador = den;
    }
}
