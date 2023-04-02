package edu.calebe.set.exercicios.exercicio02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {

    private String nome;
    private String ide;
    private Integer ano_lançamento;

    LinguagemFavorita(String nome, String ide, Integer ano_){
        this.nome = nome;
        this.ide = ide;
        this.ano_lançamento = ano_;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno_lançamento() {
        return ano_lançamento;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - " +
        "IDE: " + ide + " - " +
        "Ano de Lançamento: " + ano_lançamento;
    }


    public static void main(String[] args) {
        
        Set<LinguagemFavorita> linguagemLHS = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", "Eclipse", 1995));
            add(new LinguagemFavorita("Python", "Pycharm", 1991));
            add(new LinguagemFavorita("JavaScript", "WebStorm", 1996));
        }};

        //Ordem de inserção
        for (LinguagemFavorita linguagem : linguagemLHS) {
            System.out.println(linguagem);
        }
        System.out.println("\n");
        // Ordem Natural(Nome):
        Set<LinguagemFavorita> linguagemTreeSet = new TreeSet<>(new ComparatorNome()){{
            add(new LinguagemFavorita("Java", "Eclipse", 1995));
            add(new LinguagemFavorita("Python", "Pycharm", 1991));
            add(new LinguagemFavorita("JavaScript", "WebStorm", 1996));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 2000));
        }};

        for (LinguagemFavorita linguagem : linguagemTreeSet) {
            System.out.println(linguagem);
        }
        System.out.println("\n");
        // Ordem por IDE
        Set<LinguagemFavorita> linguagemTreeSet2 = new TreeSet<>(new ComparatorIDE()){{
            add(new LinguagemFavorita("Python", "Pycharm", 1991));
            add(new LinguagemFavorita("JavaScript", "WebStorm", 1996));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 2000));
            add(new LinguagemFavorita("Java", "Eclipse", 1995));
        }};

        for (LinguagemFavorita linguagem : linguagemTreeSet2) {
            System.out.println(linguagem);
        }
        System.out.println("\n");
        // Ordem de Ano de lançamento ou Nome:
        Set<LinguagemFavorita> linguagemTreeSet3 = new TreeSet<>(new ComparatorAnoLançaNome()){{
            add(new LinguagemFavorita("Python", "Pycharm", 1991));
            add(new LinguagemFavorita("JavaScript", "WebStorm", 1996));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 2000));
            add(new LinguagemFavorita("Java", "Eclipse", 1995));
        }};

        for (LinguagemFavorita linguagem : linguagemTreeSet3) {
            System.out.println(linguagem);
        }
        System.out.println("\n");
        // Ordem de Nome, ano de criação e IDE:
        Set<LinguagemFavorita> linguagemTreeSet4 = new TreeSet<>(new ComparatorNomeAnoLançaIDE()){{
            add(new LinguagemFavorita("Python", "Pycharm", 1991));
            add(new LinguagemFavorita("JavaScript", "WebStorm", 1996));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 2000));
            add(new LinguagemFavorita("Java", "Eclipse", 1995));
        }};

        for (LinguagemFavorita linguagem : linguagemTreeSet4) {
            System.out.println(linguagem);
        }

    }
}
