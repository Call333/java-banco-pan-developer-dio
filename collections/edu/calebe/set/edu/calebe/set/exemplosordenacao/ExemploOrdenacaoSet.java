package edu.calebe.set.exemplosordenacao;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
import java.util.LinkedHashSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t--");
        // Criando o Sett
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        // forEach
        for (Serie serie : series){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem inserção\t--");
        // Criando a LinkedHashSet
        Set<Serie> seriesLHS = new LinkedHashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        // forEach
        for ( Serie serie : seriesLHS){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> seriesTreeSet = new TreeSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for ( Serie serie : seriesTreeSet){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> seriesTreeSet2 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for ( Serie serie : seriesTreeSet2 ){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem gênero\t--");
        Set<Serie> seriesTreeSet3 = new TreeSet<>(new ComparatorGenero()){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for ( Serie serie : seriesTreeSet3 ){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem Nome\t--");
        Set<Serie> seriesTreeSet4 = new TreeSet<>(new ComparatorNome()){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for ( Serie serie : seriesTreeSet4 ){
            System.out.println(serie.getNome() + " - " + serie.getGenero() 
            + " - " + serie.getTempoEpisodio());
        }
    }
}
