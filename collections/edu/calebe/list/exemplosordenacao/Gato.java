package edu.calebe.list.exemplosordenacao;

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getIdade() {
        return idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return "Gato{" +
        "Nome = " + nome + '\'' +
        "Idade = " + idade + '\'' +
        "Cor = " + cor + '\'' +
        " }";
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}