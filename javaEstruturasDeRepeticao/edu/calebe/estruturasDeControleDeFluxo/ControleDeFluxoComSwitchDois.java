package edu.calebe.estruturasDeControleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxoComSwitchDois {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um digito de 1 a 5: ");
        int valor = s.nextInt();

        switch (valor){
            case 1,2,3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}
