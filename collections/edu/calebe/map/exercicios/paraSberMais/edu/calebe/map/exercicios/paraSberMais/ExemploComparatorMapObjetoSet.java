package edu.calebe.map.exercicios.paraSberMais;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExemploComparatorMapObjetoSet {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Alexandre", 2023000003, "125.485.963-86");
        Aluno aluno02 = new Aluno("Clarice", 2023000001, "548.693.105-23");
        Aluno aluno03 = new Aluno("Juca", 2023000002, "624.593.741-10");

        Disciplina disciplina01 = new Disciplina("Programação Web", 160);
        Disciplina disciplina02 = new Disciplina("POO", 80);
        Disciplina disciplina03 = new Disciplina("TÓPICOS ESPECIAS E PROJETO INTEGRADOR", 120);

        Set<Disciplina> disciplinas01 = new HashSet<>(Arrays.asList(disciplina01, disciplina02));
        Set<Disciplina> disciplinas02 = new HashSet<>(Arrays.asList(disciplina02, disciplina03));
        Set<Disciplina> disciplinas03 = new HashSet<>(Arrays.asList(disciplina01, disciplina03));

        Map<Aluno, Set<Disciplina>> alunoEDisciplinas = new HashMap<>(){{
            put(aluno01, disciplinas01);
            put(aluno02, disciplinas02);
            put(aluno03, disciplinas03);
        }};

        System.out.println(alunoEDisciplinas);

        for (Map.Entry<Aluno, Set<Disciplina>> aluno : alunoEDisciplinas.entrySet()) {
            System.out.println(aluno.getKey().getNome() + " - " + aluno.getKey().getMatricula());
            for (Disciplina disciplina : aluno.getValue()) {
                System.out.println(disciplina.getNome() + " ");
            }
            System.out.println();
        }
    }
}
