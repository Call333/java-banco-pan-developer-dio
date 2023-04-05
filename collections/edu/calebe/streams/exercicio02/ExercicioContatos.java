package edu.calebe.streams.exercicio02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.Map.Entry;
// import java.util.function.Function;
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

        Map<Integer, Contato> agenda = new HashMap<>() {
            {
                put(3, new Contato("Zagreus", 5555));
                put(4, new Contato("Hades", 1111));
                put(1, new Contato("Nix", 7777));
            }
        };

        for (Map.Entry<Integer, Contato> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();
        // ordem de inserção

        Map<Integer, Contato> agendaLHS = new LinkedHashMap<>() {
            {
                put(3, new Contato("Zagreus", 5555));
                put(4, new Contato("Hades", 1111));
                put(1, new Contato("Nix", 7777));
            }
        };

        for (Map.Entry<Integer, Contato> contato : agendaLHS.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();
        // Ordem de Id:
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for (Map.Entry<Integer, Contato> contato : agenda2.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();

        // Ordem Numero:

        /*
         * // USANDO CLASSE ANÔNIMA
         * Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new
         * Comparator<Map.Entry<Integer, Contato>>() {
         * // uso de classe anônima
         * 
         * @Override
         * public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer,
         * Contato> o2) {
         * return Integer.compare(o1.getValue().getTelefone(),
         * o2.getValue().getTelefone());
         * }
         * });
         */
        
        /*
         * USANDO INTERFACE FUNCIONAL
         * Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
         * new Function<Map.Entry<Integer, Contato>, Integer>() {
         * // Usando interface funcional
         * 
         * @Override
         * public Integer apply(Map.Entry<Integer, Contato> contato) {
         * return contato.getValue().getTelefone();
         * }
         * 
         * }
         * ));
         */

        // usando Lambda:

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getTelefone()));

        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : set) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }

        System.out.println();

        // Ordem de nome:
        /* 
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(new ComparatorNomeContato());
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> contato : set2) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
        */

        // Esse trecho de código faz a mesma coisa da Classe ComparatorNomeContato.java
        // (Que também está nesse arquivo para fins de comparação e estudo)

        // Aparentemente o VS Code não entende lambda de primeira:
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
            contato -> contato.getValue().getNome()
        ));
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> contato : set2) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }
}
