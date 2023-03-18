package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada do ? ");
        int tabuada = scan.nextInt();

        int count = 1;
        do {
            System.out.println(tabuada + " x " + count + " = " +  (tabuada * count));
            count++;
        } while (count < 11);
    }
}
