package edu.calebe.map.exercicios.exercicio02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioContatos {
    public static void main(String[] args) {
        
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(3, new Contato("Zagreus", 5555));
            put(4, new Contato("Hades", 1111));
            put(1, new Contato("Nix", 7777));
        }};

        for( Map.Entry<Integer, Contato> contato : agenda.entrySet() ){
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();
        // ordem de inserção

        Map<Integer, Contato> agendaLHS = new LinkedHashMap<>(){{
            put(3, new Contato("Zagreus", 5555));
            put(4, new Contato("Hades", 1111));
            put(1, new Contato("Nix", 7777));
        }};

        for( Map.Entry<Integer, Contato> contato : agendaLHS.entrySet() ){
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();
        // Ordem de Id:
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for( Map.Entry<Integer, Contato> contato : agenda2.entrySet() ){
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();
        
        // Ordem Numero:

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer,Contato> contato : set) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }   

        System.out.println();

        // Ordem de nome:

        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(new ComparatorNomeContato());
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> contato : set2) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }   
}
