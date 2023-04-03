package edu.calebe.map.ordenacao;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return Integer.compare(o1.getValue().getnPaginas(), o2.getValue().getnPaginas());
    }
    
}
