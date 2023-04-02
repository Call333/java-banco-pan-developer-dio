package edu.calebe.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        /* Formas de inciar um Set
         * Set notas = new HashSet();
         * Set<Double> notas = new HashSet<>();
         * HashSet<Double> notas = new HashSet<>();
         * Set<Double> notas = new HashSet<>(Arrays.asList(7, 8.5, 9.3, 5, 7, 0, 3,6));
         * Set<Double notas = Set.of(7, 8.5, 9.3, 5, 7, 0, 3,6);
         * notas.add(1d);
         * notas.remove(5d);
         * System.out.println(notas);
         * 
         * no Set, não exite IndexOf(), get();
         */

        System.out.println("\nCrie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d));
        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0: ");
        // Não é possível, pois o Set não tem o metódo IndexOf();

        System.out.println("\nAdcione na lista a nota 8.0 na posição 4: ");
        // Não é possível, pois o Set não tem como acessar itens por índice

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        // Não é possível, pois além de você não poder encontrar o índice 
        // você não pode fazer pesquisas

        System.out.println("\nConfira se nota 5 está no conjunto: " 
        + (notas.contains(5d) ? "Sim" : "Não"));

        System.out.println("\nExiba a terceira nota adicionado: ");
        // Não é possível fazer pesquisas num Set, 
        // até por que a roda de inserção não é preservada

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a soma das notas: ");

        Iterator<Double> iter = notas.iterator();
        Double soma = 0d;
        while(iter.hasNext()){
            Double next = iter.next();
            soma += next;
        }
        System.out.print(soma);

        System.out.println("\nExiba a média das notas: " + ( soma / notas.size()));

        System.out.println("\nRemova a nota 0.0: ");
        notas.remove(0d);
        System.out.print("\n" + notas);

        System.out.println("\nRemova a nota da posição 0.0: ");
        // não é possível acessar o indice em Sets.

        System.out.println("\nRemova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iter2 = notas.iterator();
        while(iter2.hasNext()){
            double next = iter2.next();
            if(next < 7){
                iter2.remove();
            }
        }
        System.out.print(notas);

        System.out.println("\nExiba todas as notas na ordem em que foram infomadas: ");
        // Não é psosivel por que no Sets com as HashSet, Entretanto:
        Set<Double> notas2 = new LinkedHashSet<>(){{
            add(7d);
            add(8.5d);
            add(9.3d);
            add(5d);
            add(7d);
            add(0d);
            add(3.6); 
        }};
        System.out.print(notas2);

        // TreeSet respeita a ordem crescente dos elementos, como uma arvóre.
        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(){{
            add(7d);
            add(8.5d);
            add(9.3d);
            add(5d);
            add(7d);
            add(0d);
            add(3.6); 
        }};
        System.out.println(notas3);
        
        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }   
}