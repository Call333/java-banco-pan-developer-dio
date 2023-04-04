package edu.calebe.map.exercicios.paraSberMais;

import java.util.Objects;


public class Disciplina implements Comparable<Disciplina>{
    private String nome;
    private Integer duracao;
    
    Disciplina(String n, Integer d){
        this.nome = n;
        this.duracao = d;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Disciplina = " + nome + " | Duração = " + duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina disciplina = (Disciplina) o;
        return this.nome.equals(disciplina.nome) && duracao.equals(disciplina.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }


    @Override
    public int compareTo(Disciplina disciplina) {
        return this.getNome().compareToIgnoreCase(disciplina.getNome());
    }
}
