package edu.calebe.estruturasDeRepeticaoEArrays.arrays;

import java.util.Random;

public class Ex3_NumerosAleatoriosCurto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
            System.out.print(numerosAleatorios[i] + " "); // Números aleatórios

            System.out.print((numerosAleatorios[i] - 1) + " "); // Antecessores

            System.out.print((numerosAleatorios[i] + 1) + " "); //  Sucessores
        }
    }
    // Exemplo curto e mediocre, o que a orientadora ensinou é melhor 👍
}
