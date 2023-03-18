package edu.calebe.estruturasDeRepeticaoEArrays.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Digite a letra: ");
            String letra = scan.next();

            if ( 
                !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))
            ){
                consoantes[count] = letra;
                quantConsoantes++;
            }

            count++;
        } while(count < consoantes.length);

        System.out.print("\nConsoantes: ");
        for (String consoante : consoantes) {
            if( consoante != null) {
                System.out.print( consoante + " ");
            }
        }
        System.out.println("\nQuantida de consoantes: " + quantConsoantes);
    }
}
