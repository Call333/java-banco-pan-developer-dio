package edu.calebe.streams.exercicio02;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
    
}
