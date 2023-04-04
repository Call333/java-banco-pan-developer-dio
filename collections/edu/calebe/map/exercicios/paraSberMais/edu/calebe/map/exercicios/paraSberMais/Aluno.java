package edu.calebe.map.exercicios.paraSberMais;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer matricula;
    private String cpf;

    Aluno(String nome, Integer matricula, String cpf){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public Integer getMatricula() {
        return matricula;
    }
    public String getCpf() {
        return cpf;
    }
    
    @Override
    public String toString() {
        return "Aluno(a): " + nome + " | " +
        "Matricula: " + matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.nome) && this.matricula.equals(aluno.matricula) && this.cpf.equals(aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, cpf);
    }
}
