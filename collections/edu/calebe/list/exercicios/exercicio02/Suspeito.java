package edu.calebe.list.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Suspeito {
    public static void main(String[] args) {
        List<String> respPerguntas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("------PERGUNTAS------");

        System.out.println("Telefonou para a vítima?");
        String resposta = scan.next();
        respPerguntas.add(resposta);
        System.out.println("Esteve no local do crime?");
        resposta = scan.next();
        respPerguntas.add(resposta);
        System.out.println("Mora perto da vítima?");
        resposta = scan.next();
        respPerguntas.add(resposta);
        System.out.println("Devia algo para a vítima?");
        resposta = scan.next();
        respPerguntas.add(resposta);
        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next();
        respPerguntas.add(resposta);

        scan.close();

        Iterator<String> iter = respPerguntas.iterator();

        int i = 0;

        while(iter.hasNext()){
            String next = iter.next();
            if(next.contains("s")){
                i++;
            }
        }

        if( i == 2){
            System.out.println("Suspeito(a)");
        }else if(i == 3 || i == 4){
            System.out.println("Cúmplice");
        }else if(i == 5){
            System.out.println("Assassino(a)");
        }else{
            System.out.println("Inocente");
        }
    }   
}
