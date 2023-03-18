package edu.calebe.operadores;

import java.util.Date;

public class Operadores {

    // Atribuição =
    String nome = "Calebe"; // String sempre com aspas duplas ""
    int idade = 19;
    double peso = 68.5;
    char sexo = 'M'; // charaters sempre com aspas simples ''
    boolean doadorDeOrgao = false;
    Date dataNascimento = new Date(); // certos instancias podem ser fora de um main

    // Aritméticos
    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    String nomeCompleto = "Linguagem" + "Java";


    public static void main(String[] args) {
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1"; // 31
        concatenacao = 1 + "1" + 1 + 1; // 1111
        concatenacao = 1 + "1" + 1 + "1"; // 1111
        concatenacao = "1" + 1 + 1 + 1; // 1111
        concatenacao = "1" + (1 + 1 + 1); // 13
        // System.out.println(concatenacao);


        // Ternário
        int a,b;
        a = 5;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso";
        // System.out.println(resultado);

        // Relacionais
        
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;

        boolean simNao = numero1 == numero2;
        // System.out.println(simNao); // false

        simNao = numero1 != numero2;
        // System.out.println(simNao); // true

        simNao = numero1 > numero2;
        // System.out.println(simNao); // 

        String nomeUm = "CALEBE";
        String nomeDois = "CALEBE";

        // System.out.println(nomeUm == nomeDois); // true
        nomeDois = new String("CALEBE"); 
        // System.out.println(nomeUm == nomeDois); // false

        // Objetos ocupam espaços na memoria de uma forma diferente dos números
        // Em caso de objetos use o Equals

        // System.out.println(nomeUm.equals(nomeDois)); // true

        boolean condicao1 = true;
        boolean condicao2 = true;
        
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
