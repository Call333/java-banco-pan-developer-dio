package edu.calebe.estruturasDeControleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        System.out.print("Digite um número refente ao mês: ");
        int valor = i.nextInt();

        String jan = "Janeiro";
        String fev = "Fevereiro";
        String mar = "Março";
        String abr = "Abril";
        String mai = "Maio";
        String jun = "Junho";
        String jul = "Julho";
        String ago = "Agosto";
        String set = "Setembro";
        String out = "Outubro";
        String nov = "Novembro";
        String dez = "Dezembro";

        if(valor == 1) {
            System.out.println(jan);
        }else if(valor == 2){
            System.out.println(fev);
        }else if(valor == 3){
            System.out.println(mar);
        }else if(valor == 4){
            System.out.println(abr);
        }else if(valor == 5){
            System.out.println(mai);
        }else if(valor == 6){
            System.out.println(jun);
        }else if(valor == 7){
            System.out.println(jul);
        }else if(valor == 8){
            System.out.println(ago);
        }else if(valor == 9){
            System.out.println(set);
        }else if(valor == 10){
            System.out.println(out);
        }else if(valor == 11){
            System.out.println(nov);
        }else if(valor == 12){
            System.out.println(dez);
        }else{
            System.out.println("Mês inexistente");
        }

        if(valor == 7 || valor == 12 || valor == 1){
            System.out.println("Férias");
        }
    }
}
