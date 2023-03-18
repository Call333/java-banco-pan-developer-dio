package exe.calebe.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Alexandre o Bigger");
        aluno.put("Idade", "16");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "845A");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaDeAlunos = new ArrayList<>();

        listaDeAlunos.add(aluno);
        
        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria a Bigger");
        aluno2.put("Idade", "17");
        aluno2.put("Média", "8.5");
        aluno2.put("Turma", "845A");

        listaDeAlunos.add(aluno2);

        System.out.println(listaDeAlunos);

        System.out.println(aluno.containsKey("Nome "));


    }
}
