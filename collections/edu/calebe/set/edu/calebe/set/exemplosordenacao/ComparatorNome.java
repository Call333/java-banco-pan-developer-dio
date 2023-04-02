package edu.calebe.set.exemplosordenacao;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
    
}
