package edu.calebe.map.exercicios.paraSberMais;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNomeAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Entry<Disciplina, Aluno> o1, Entry<Disciplina, Aluno> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
    
}
