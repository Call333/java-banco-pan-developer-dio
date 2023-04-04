package edu.calebe.map.exercicios.paraSberMais;

import java.util.Comparator;

public class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {

    @Override
    public int compare(Disciplina o1, Disciplina o2) {
        return Integer.compare(o1.getDuracao(), o2.getDuracao());
    }
    
}
