package edu.calebe.estruturasDeControleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxoComSwitch {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        System.out.print("Digite um número refente ao dia da semana: ");
        int valor = s.nextInt();

        String dom = "Domingo";
        String seg = "Segunda";
        String ter = "Terça";
        String qua = "Quarta";
        String qui = "Quinta";
        String sex = "Sexta";
        String sab = "Sábado";

        switch (valor) {
            case 1:
                System.out.println(dom);
                break;
            case 2:
                System.out.println(seg);
                break;
            case 3:
                System.out.println(ter);
                break;
            case 4:
                System.out.println(qua);
                break;
            case 5:
                System.out.println(qui);
                break;
            case 6:
                System.out.println(sex);
                break;
            case 7:
                System.out.println(sab);
                break;    
            default:
                System.out.println("Dia da semana inexistente");
                break;
        }
    }
}
