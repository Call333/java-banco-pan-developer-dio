package edu.calebe.streams.exercicio02;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getTelefone(), o2.getValue().getTelefone());
    }
    
}
