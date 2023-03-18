package edu.calebe.estruturasDeRepeticaoEArrays.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4]; 
        // Primeira abertura de colchete representa a linha, a segunda representa a coluna
        // [linha][coluna]

        for( int l = 0; l < matriz.length; l++){ // Navega pelas linhas
            // int numeros = random.nextInt(9);
            for( int c = l; c < matriz[l].length; c++){ // navega pelas colunas
                matriz[l][c] = random.nextInt(9);
            }
        }

        for ( int[] linha : matriz) {
            for ( int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
