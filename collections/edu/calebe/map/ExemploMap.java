package edu.calebe.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,4km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kwid - consumo = 15,6 km/l
*/

// Map carrosPopulares2020 = new HashMap(); //antes do java 5
// Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) -
// Diamont Operator(jdk 7)
// HashMap<String, Double> carrosPopulares = new HashMap<>();
// Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6,
// "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

public class ExemploMap {
    public static void main(String[] args) {
        
        // Crie um dicinário que relacione os modelos e seus respectivos consumos:
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4d);
            put("Uno", 15.6d);
            put("Mobi", 16.1);
            put("HB20", 14.5d);
            put("Kwid", 15.6d);
        }};

        System.out.println(carrosPopulares);

        //Substitua o consumo de gol por 15.2 km/L: 
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        // Confira se o modelo Tucson está no dicionário: 
        System.out.println("Existe o Modelo Tucson no dicionário: " + carrosPopulares.containsKey("Tucson"));

        // Exiba o consumo do uno
        System.out.println("Uno consumo: " + carrosPopulares.get("Uno"));

        // Exiba o terceiro modelo adicionado:
        // Não existe método para isso em Map, assim como os Sets

        // Exiba os modelos:
        System.out.println(carrosPopulares.keySet()); // retorna um Set
        // Set<String> = modelos = carrosPopulares.keySet();
        // Exiba os consumos dos carros:
        System.out.println(carrosPopulares.values()); // retona uma collection
        // Collection<Double> consumos = carrosPopulares.values();
        // Exiba o modelo mais econômico e seu consumo:

        Double consumo_eficiente = Collections.max(carrosPopulares.values()); 
        // pode usar com values() pq o mesmo retorna uma collection, nesse caso de doubles
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); 
        String modelo_eficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumo_eficiente)){
                modelo_eficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modelo_eficiente + " - Consumo: " + consumo_eficiente);
            }
        }
        
        // Exiba o modelo menos econômico e seu consumo:

        Double consumo_menos_eficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modelo_menos_eficiente = "";

        for ( Map.Entry<String, Double> entry : entries2) {
            if(entry.getValue().equals(consumo_menos_eficiente)){
                modelo_menos_eficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modelo_menos_eficiente + " - Consumo: " + consumo_menos_eficiente);
            }
        }

        // Exiba a soma dos consumos:
        Iterator<Double> iterator = carrosPopulares.values().iterator();// values retorna uma collection
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos: " + soma);

        // Exiba a média dos consumos:
        System.out.println("A média dos consumos: " + (soma / carrosPopulares.size()));

        // Remova os modelos com o consumo igual a 15.6 km/L:
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();// values retorna uma collection
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println("Os modelos sem o consumo 15.6 km/L: " + carrosPopulares);

        //Exiba todos os carros na ordem em que foram informados: 
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("Gol", 14.4d);
            put("Uno", 15.6d);
            put("Mobi", 16.1);
            put("HB20", 14.5d);
            put("Kwid", 15.6d);
        }};

        System.out.println(carrosPopulares2);

        // Exiba o dicionário ordenado pelo modelo: 
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);

        System.out.println(carrosPopulares3);

        // Apague o conjunto de carros:
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        // Confira se a lista está vázia:
        System.out.println(carrosPopulares.isEmpty());

        System.out.println(carrosPopulares2.entrySet()); // Aparentemente resgata valores na forma de um Set
    }
}
