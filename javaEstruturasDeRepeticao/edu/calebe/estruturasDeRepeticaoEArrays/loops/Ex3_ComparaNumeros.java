package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex3_ComparaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;

        int x = 0;
        
        do {
            System.out.println("Digite um número para comparar: ");
            numero = scan.nextInt();

            if(numero > maior){
                maior = numero;
            }

            soma += numero;

            x++; 
        } while (x < 5);

        System.out.println("O maior número da sequencia é: " + maior);
        System.out.println("A Média dos números digitados é: " + (soma/x));
    }   

}
