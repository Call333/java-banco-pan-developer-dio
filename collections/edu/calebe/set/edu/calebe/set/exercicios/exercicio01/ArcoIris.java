package edu.calebe.set.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {

    private String cor;
    public Object getCor;

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cor: " + cor;
    }

    public static void main(String[] args) {

        // Exiba todas as cores uma abaixo da outra

        Set<ArcoIris> arcoIris = new LinkedHashSet<>() {
            {
                add(new ArcoIris("Vermelho"));
                add(new ArcoIris("Laranja"));
                add(new ArcoIris("Amarelo"));
                add(new ArcoIris("Verde"));
                add(new ArcoIris("Azul"));
                add(new ArcoIris("Anil"));
                add(new ArcoIris("Violeta"));
            }
        };

        for (ArcoIris cor : arcoIris) {
            System.out.println(cor);
        }

        // Exbiba a Quanitdade de cores que o arco-íris tem:
        System.out.println("\nTotal de cores no arco-íris: " + arcoIris.size());

        // Exiba as cores ordem alfabética
        System.out.println("\nCores em ordem alfabética: ");
        Set<ArcoIris> arcoIris2 = new TreeSet<>(new ComparatorCor()) {
            {
                add(new ArcoIris("Vermelho"));
                add(new ArcoIris("Laranja"));
                add(new ArcoIris("Amarelo"));
                add(new ArcoIris("Verde"));
                add(new ArcoIris("Azul"));
                add(new ArcoIris("Anil"));
                add(new ArcoIris("Violeta"));
            }
        };

        for (ArcoIris cor : arcoIris2) {
            System.out.println(cor);
        }

        // Exiba as cores na ordem inversa das que foram informadas

        List<ArcoIris> coresInversas = new ArrayList<>(arcoIris);
        Collections.reverse(coresInversas);
        System.out.println("\ncores na ordem inversa: ");
        for (ArcoIris cor : coresInversas) {
            System.out.println(cor);
        }

        // Exiba todas as cores que começam com a letra "v":
        System.out.println("\nCores que começam com v: ");
        for (ArcoIris cor : arcoIris) {
            if (cor.getCor().startsWith("V")) {
                System.out.println(cor);
            }
        }

        //Remova todas as cores que começam com a letra "V":
        Iterator<ArcoIris> iter = arcoIris.iterator();
        while(iter.hasNext()){
            if(iter.next().getCor().startsWith("V")){
                iter.remove();
            }
        }
        System.out.println("\n" + arcoIris);

        // Remova todas as cores:
        arcoIris.clear();
        System.out.println("\n" + arcoIris);

        // Diga se a lista está vazia:
        System.out.println("\nConjunta está vazio: " + arcoIris.isEmpty());
    }
}
