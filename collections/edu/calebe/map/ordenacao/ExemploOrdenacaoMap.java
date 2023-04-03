package edu.calebe.map.ordenacao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        // Exiba na Ordem Aleatória:
        Map<String, Livro> livros = new HashMap<>();
        livros.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        livros.put("Hawking, Stephen", new Livro("Uma Breva História do Tempo", 292));
        livros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        
        
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");

        // Exiba na Ordem de Inserção:
        Map<String, Livro> livros2 = new LinkedHashMap<>();
        livros2.put("Hawking, Stephen", new Livro("Uma Breva História do Tempo", 292));
        livros2.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        livros2.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");

        // Exiba na Ordem Alfabética de Autores:
        Map<String, Livro> livros3 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro : livros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");

        // Exiba na Ordem Alfabética nomes dos livros:
        Set<Map.Entry<String, Livro>> livrosEntry = new TreeSet<>(new ComparatorNome());
        livrosEntry.addAll(livros.entrySet());

        for (Map.Entry<String,Livro> entry : livrosEntry) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("");

        // Exiba na Ordem do Número de Páginas:
        Set<Map.Entry<String, Livro>> livrosEntry2 = new TreeSet<>(new ComparatorPaginas());
        livrosEntry2.addAll(livros.entrySet());
        for (Map.Entry<String,Livro> livroEntry : livrosEntry2) {
            System.out.println(livroEntry.getKey() + " - " + 
            livroEntry.getValue().getNome() + " - " + 
            livroEntry.getValue().getnPaginas());
        }

    }
}
