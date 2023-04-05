package edu.calebe.streams.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
// import java.util.function.Function;
// import java.util.Set;
// import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String:");
        // numerosAleatorios.stream().forEach(
        // new Consumer<String>() {
        // // uso de Functions:
        // @Override
        // public void accept(String t) {
        // System.out.println(t);
        // }

        // });

        // Lambda
        numerosAleatorios.stream().forEach(t -> System.out.println(t));
        // reference method
        // numerosAleatorios.forEach(System.out::println);

        System.out.println("Imprima os 5 primeiros números e coloque dentro de um Set: ");
        // pega os 5 primeiros número:

        // Uma outra maneira:
        // Set<String> collectorSet = numerosAleatorios.stream()
        // .limit(5)
        // .collect(Collectors.toSet());

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        // Set não aceita elementos repetidos

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");

        // numerosAleatorios.stream().map(
        // new Function<String, Integer>() {

        // @Override
        // public Integer apply(String t) {
        // return Integer.parseInt(t);
        // }

        // }
        // ).collect(Collectors.toList());

        // Uma forma:
        List<Integer> nAleatoriosInteger =  numerosAleatorios.stream()
        .map(t -> Integer.parseInt(t))
        .collect(Collectors.toList());

        // usando reference method:
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> collectToList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collectToList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");

        // numerosAleatorios.stream()
        //         .map(Integer::parseInt)
        //         .filter(
        //                 new Predicate<Integer>() {

        //                     @Override
        //                     public boolean test(Integer t) {
        //                         if (t % 2 == 0 && t > 2) {
        //                             return true;
        //                         }
        //                         return false;
        //                     }
        //                 })
        //         .collect(Collectors.toList())
        //         .forEach(System.out::println);
                        
        // List<Integer> collectoParesMaiorQ2 = numerosAleatorios.stream()
        // .map(Integer::parseInt)
        // .filter(
        //         new Predicate<Integer>() {

        //             @Override
        //             public boolean test(Integer t) {
        //                 if (t % 2 == 0 && t > 2) {
        //                     return true;
        //                 }
        //                 return false;
        //             }
        //         })
        // .collect(Collectors.toList());

        // System.out.println(collectoParesMaiorQ2);

        List<Integer> collectoParesMaiorQ2 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(t -> (t % 2 == 0 && t > 2))
        .collect(Collectors.toList());

        System.out.println(collectoParesMaiorQ2);

        System.out.println("Mostre a média dos números: ");

        // numerosAleatorios.stream()
        //     .mapToInt(
        //         new ToIntFunction<String>() {

        //             @Override
        //             public int applyAsInt(String value) {
        //                 return Integer.parseInt(value);
        //             }
                    
        //         }
        //     );

        // com lambida:
        // numerosAleatorios.stream()
        //     .mapToInt( s -> Integer.parseInt(s));

        // com reference method & function(Consumer):
        // numerosAleatorios.stream()
        //     .mapToInt(Integer::parseInt)
        //     .average().ifPresent(
        //         new DoubleConsumer() {

        //             @Override
        //             public void accept(double value) {
        //                 System.out.println(value);
        //             }
                    
        //         }
        //     );
        
        // reference method & lambda
        // numerosAleatorios.stream()
        //     .mapToInt(Integer::parseInt)
        //     .average()
        //     .ifPresent(v -> System.out.println(v));

        // 100% reference method(Brabo):
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
            
        System.out.println("Remova os valores impares: ");
        // nAleatoriosInteger.removeIf(
        //     new Predicate<Integer>() {

        //         @Override
        //         public boolean test(Integer t) {
        //             if(t % 2 != 0) return true;
        //             return false;
        //         }
                
        //     }
        // );
        
        nAleatoriosInteger.removeIf(
            t -> (t % 2 != 0));
        System.out.println(nAleatoriosInteger);
    }
}
