package edu.calebe.set.exercicios.exercicio02;

import java.util.Comparator;

public class ComparatorNomeAnoLançaIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;

        int ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if(ide != 0) return ide;

        return Integer.compare(o1.getAno_lançamento(), o2.getAno_lançamento());
    }
    
}
