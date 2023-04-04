package edu.calebe.map.exercicios.paraSberMais;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorMatriculaAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Entry<Disciplina, Aluno> o1, Entry<Disciplina, Aluno> o2) {
        return Integer.compare(o1.getValue().getMatricula(), o2.getValue().getMatricula());
    }
    
}
