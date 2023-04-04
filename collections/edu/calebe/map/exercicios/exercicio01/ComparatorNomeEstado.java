package edu.calebe.map.exercicios.exercicio01;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNomeEstado implements Comparator<Map.Entry<String, Integer>>{

    @Override
    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o1.getKey().compareToIgnoreCase(o2.getKey());
    }

}
