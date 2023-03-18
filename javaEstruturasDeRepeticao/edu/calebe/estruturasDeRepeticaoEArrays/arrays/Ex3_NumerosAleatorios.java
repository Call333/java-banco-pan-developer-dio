package edu.calebe.estruturasDeRepeticaoEArrays.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorNumerosAleatorios = new int[20];

        // Aleatorizando os números
        for( int i = 0; i < vetorNumerosAleatorios.length; i++ ){
            int numero = random.nextInt(100); // Sorteando um por vez, entre 0 e 100
            vetorNumerosAleatorios[i] = numero; // Adiocinando o número na lista
        }
        // Exibindos números
        System.out.println("Números Aleatórios: ");
        for (int numeros : vetorNumerosAleatorios) {
            System.out.print(numeros + " ");
        }
        // Exibindo os números antecessores
        System.out.println("Antecessor dos números aleatórios: ");
        for ( int numeros : vetorNumerosAleatorios){
            System.out.print((numeros - 1) + " ");
        }
        // Exibindo os números sucessores
        System.out.println("Sucesores dos números aleatórios: ");
        for (int numeros : vetorNumerosAleatorios) {
            System.out.print((numeros + 1) + " ");
        }
    }
}