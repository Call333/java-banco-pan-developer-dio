package edu.calebe.list.exemplosordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
 * e ordene esta lista exibindo:
 * (nome - idade - cor);
 * Gato 1 = nome: Jon, idade: 18 meses, cor: preto;
 * Gato 2 = nome: Simba, idade: 6 meses, cor: tigrado;
 * Gato 3 = nome: Jon, idade: 12 meses, cor: amarelo; 
 */

public class ExenploOrdenacaoList {
    public static void main(String[] args) {
    
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("\n--\tOrdem de Inserção\t--");
        System.out.println(gatos);

        System.out.println("\n--\tOrdem Aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("\n--\tOrdem Natural (nome)\t--");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("\n--\tOrdem Idade\t--");
        Collections.sort(gatos, new ComparatorIdade());
        // gatos.sort(new ComparatorIdade()); // Funciona também
        System.out.println(gatos);
        
        System.out.println("\n--\tOrdem Cor\t--");
        Collections.sort(gatos, new ComparatorCor());
        // gatos.sort(new ComparatorCor()); // Funciona também
        System.out.println(gatos);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        // gatos.sort(new ComparatorNomeCorIdade());
        // nesse caso o critério de desempate será as cores, pois são diferentes
        System.out.println(gatos);
    }
}