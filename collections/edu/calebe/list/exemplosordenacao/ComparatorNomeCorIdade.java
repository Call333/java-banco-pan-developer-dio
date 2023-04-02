package edu.calebe.list.exemplosordenacao;

import java.util.Comparator;

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        // comparando se os gatos são iguais em nome
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        // se gato não for igual, retorne pelo nome
        if(nome != 0) return nome;

        // comparando se os gatos tem as mesmas cores 
        int cor = o1.getCor().compareToIgnoreCase(o1.getCor());
        // se a cor for diferente, retorne pela cor
        if(cor != 0) return cor;

        /* se não for nem pelo nome, muito menos pela(ou seja, eles tem ambos 
        os atributos iguais), vá pela idade*/
        return Integer.compare(o1.getIdade(), o2.getIdade());

    }

}
