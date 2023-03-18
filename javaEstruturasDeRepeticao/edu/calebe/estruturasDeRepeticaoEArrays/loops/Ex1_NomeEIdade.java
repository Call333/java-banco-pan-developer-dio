package edu.calebe.estruturasDeRepeticaoEArrays.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String valorNome;
        int valorIdade;
        
        while(true){

            System.out.print("Digite o nome do aluno: " + "\n");
            valorNome = scanner.next();
            if(valorNome.equals("0")){ // sem o if, o programa roda infinitamente
                break;
            }

            System.out.print("Digite a idade do aluno: " + "\n");
            valorIdade = scanner.nextInt();

            System.out.println("Nome e idade do aluno: " + valorNome + ", " + valorIdade);
        }

        System.out.println("parou...");
    }
}