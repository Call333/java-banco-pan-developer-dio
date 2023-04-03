package edu.calebe.list.exemplosordenacao;

import java.util.Comparator;

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
    
}