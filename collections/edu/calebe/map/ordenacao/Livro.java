package edu.calebe.map.ordenacao;

import java.util.Objects;

public class Livro {
    private String nome;
    private Integer nPaginas;

    Livro(String nome, Integer paginas){
        this.nome = nome;
        this.nPaginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getnPaginas() {
        return nPaginas;
    }
    
    @Override
    public String toString() {
        return "Livro = Nome: " + nome + " - " + 
        "Número de páginas " + nPaginas;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return nome.equals(livro.nome) && nPaginas.equals(livro.nPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nPaginas);
    }
}
