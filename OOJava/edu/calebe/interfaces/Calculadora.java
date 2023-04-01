package edu.calebe.interfaces;

public class Calculadora implements OperacaoMatematica{

    // A Classe que é implementada deve conter todos os metódos da Interface

    @Override
    public void somar(double valor1, double valor2) {
        System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2) );

    }

    @Override
    public void substrair(double valor1, double valor2) {
        System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2) );
    }

    @Override
    public void multiplicar(double valor1, double valor2) {
        System.out.println(valor1 + " * " + valor2 + " = " + (valor1 * valor2) );
    }

    @Override
    public void dividir(double valor1, double valor2) {
        System.out.println(valor1 + " / " + valor2 + " = " + (valor1 / valor2) );
    }
    
}
