package edu.calebe.set.exercicios.exercicio02;

import java.util.Comparator;

public class ComparatorNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
    
}
