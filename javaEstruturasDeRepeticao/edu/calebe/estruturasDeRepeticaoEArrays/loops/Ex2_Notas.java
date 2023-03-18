package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex2_Notas {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.print("Digite um número entre 0 e 10: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Valor inválido, tente novamente: ");
            nota = scan.nextInt();
        }
        
    }
}
