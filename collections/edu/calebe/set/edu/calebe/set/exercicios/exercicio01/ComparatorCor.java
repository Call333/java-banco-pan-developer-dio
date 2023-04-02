package edu.calebe.set.exercicios.exercicio01;

import java.util.Comparator;

public class ComparatorCor implements Comparator<ArcoIris> {

    public int compare(ArcoIris o1, ArcoIris o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
    
}
