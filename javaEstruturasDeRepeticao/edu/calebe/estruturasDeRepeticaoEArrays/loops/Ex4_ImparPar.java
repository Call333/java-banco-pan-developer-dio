package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex4_ImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        System.out.print("Digite quantos numeros deseja comparar: ");
        quantNumeros = scan.nextInt();
        int numero;

        int numPares = 0;
        int numImpares = 0;

        int count = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                numPares++;
            }else{
                numImpares++;
            }

            count++;
        } while (count < quantNumeros);
        
        System.out.println("Quantidade de números impares: " + numImpares);
        System.out.println("Quantidade de números pares: " + numPares);
    }
}
