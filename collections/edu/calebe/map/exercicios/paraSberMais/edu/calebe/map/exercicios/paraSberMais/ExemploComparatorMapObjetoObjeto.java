package edu.calebe.map.exercicios.paraSberMais;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
*/
public class ExemploComparatorMapObjetoObjeto {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Alexandre", 2023000003, "125.485.963-86");
        Aluno aluno02 = new Aluno("Clarice", 2023000001, "548.693.105-23");
        Aluno aluno03 = new Aluno("Juca", 2023000002, "624.593.741-10");

        Disciplina disciplina01 = new Disciplina("Programação Web", 160);
        Disciplina disciplina02 = new Disciplina("POO", 80);
        Disciplina disciplina03 = new Disciplina("TÓPICOS ESPECIAS E PROJETO INTEGRADOR", 120);

        Map<Disciplina, Aluno> cursos = new HashMap<>(){{
            put(disciplina01, aluno01);
            put(disciplina02, aluno02);
            put(disciplina03, aluno03);
        }};
        
        for (Map.Entry<Disciplina, Aluno> emptys : cursos.entrySet()) {
            System.out.println(emptys.getKey() + " - " + emptys.getValue());
        }

        System.out.println("\n");
        // A)

        Map<Disciplina, Aluno> cursos2 = new TreeMap<>(cursos);
        for (Map.Entry<Disciplina, Aluno> curso : cursos2.entrySet()) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\n");

        // B)
        Map<Disciplina, Aluno> cursos3 = new TreeMap<>(new ComparatorDuracaoDisciplina());
        cursos3.putAll(cursos);

        for (Map.Entry<Disciplina, Aluno> curso : cursos3.entrySet()) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\n");

        // C)
        Set<Map.Entry<Disciplina, Aluno>> cursos4 = new TreeSet<>(new ComparatorNomeAluno());
        cursos4.addAll(cursos.entrySet());

        for (Map.Entry<Disciplina,Aluno> curso : cursos4) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\n");

        // D)
        Set<Map.Entry<Disciplina, Aluno>> cursos5 = new TreeSet<>(new ComparatorMatriculaAluno());
        cursos5.addAll(cursos.entrySet());

        for (Map.Entry<Disciplina,Aluno> curso : cursos5) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }
    }   
}
