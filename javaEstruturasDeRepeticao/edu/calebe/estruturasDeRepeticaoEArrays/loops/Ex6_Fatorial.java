package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial do ? ");
        int fatorial = scan.nextInt();

        int multiplacao = 1;

        for( int i = fatorial; i >= 1; i--){
            multiplacao *= i;
        }

        System.out.println(fatorial + "! = " + multiplacao);
    }
}
