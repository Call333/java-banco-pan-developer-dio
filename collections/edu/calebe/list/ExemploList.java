package edu.calebe.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();// Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(8d);
        notas.add(9d);
        notas.add(7d);
        notas.add(6d);
        notas.add(5d);
        notas.add(8.7);
        notas.add(0d);
        notas.add(3d);

        System.out.println("\nExiba a lista de notas: ");
        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 6: \n" + notas.indexOf(6d));

        System.out.println("\nAdicione na lista a nota 4.5 na posição 4: " );
        notas.add(4, 4.5);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("\n" + notas);

        System.out.println("Confira se a nota 5.0 está na lista: \n" + notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("\nExiba a terceira nota adicionada: \n" + notas.get(2));

        System.out.println("\nExiba a menor nota: \n" + Collections.min(notas));

        System.out.println("\nExiba a maior nota: \n" + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        // usando Iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\n" + soma);

        // usando forEach
        // double soma = 0;
        // for (Double nota : notas) {
        //     soma = soma + nota;
        // }
        // System.out.println(soma);

        System.out.println("\nExiba a média das notas: \n" + (soma / notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(notas.indexOf(0d)); // ou notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        // System.out.println("\nRemova as notas menores que 7.0 e exiba a lista: ");
        // Iterator<Double> iterator2 = notas.iterator();

        // while(iterator2.hasNext()){
        //     Double next = iterator2.next();
        //     if(next < 7){
        //         iterator2.remove();
        //     }
        // }
        // System.out.println(notas);

        // System.out.println("\nApague a toda a lista: ");
        // notas.clear();
        // System.out.println(notas);

        System.out.println("\nConfira se a lista está vázia: \n" + notas.isEmpty());
        // String valor = (notas.isEmpty() == true ? "Sim" : "Não");
        
        System.out.println("\nCrie uma lista chamada notas2 " + 
        "e coloque todos os elementos de List ArrayList nessa nova lista: ");
        List<Double> notas2 = new LinkedList<>();

        Iterator<Double> iterator3 = notas.iterator();
        while(iterator3.hasNext()){
            Double next = iterator3.next();
            notas2.add(next);
        }
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: \n" + notas2.get(0));
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: \n" + notas2.remove(0));
        System.out.println(notas2);
    }
    // List notas = new ArrayList(); // antes do jdk 5
    // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5d, 9.5d, 6d, 1d, 4.5d));
    // List<Double> notas = Arrays.asList(7d, 8.5d, 9.5d, 6d, 1d, 4.5d); // assim não é tão bom pq não dá add nada mais
    // ArrayList<Double> notas = new ArrayList<>();

}