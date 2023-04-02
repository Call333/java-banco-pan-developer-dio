package edu.calebe.set.exercicios.exercicio02;

import java.util.Comparator;

public class ComparatorAnoLançaNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        
        int ano_lançamento = Integer.compare(o1.getAno_lançamento(), o2.getAno_lançamento());
        if(ano_lançamento != 0){
            return ano_lançamento;
        }
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
    
}
