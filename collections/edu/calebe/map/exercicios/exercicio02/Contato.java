package edu.calebe.map.exercicios.exercicio02;

import java.util.Objects;

public class Contato {
    
    private String nome;
    private Integer telefone;

    Contato(String nome, Integer telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato: " + nome + " - " +
        "Telefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return nome.equals(contato.nome) && telefone.equals(contato.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone);
    }

}
