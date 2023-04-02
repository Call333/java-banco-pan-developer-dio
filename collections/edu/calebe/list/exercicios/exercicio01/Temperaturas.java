package edu.calebe.list.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperaturas {
    public static void main(String[] args) {
        List<Temperatura> temperaturas = new ArrayList<>(){{
            add(new Temperatura("Janeiro", 23d));
            add(new Temperatura("Fevereiro", 27d));
            add(new Temperatura("Março", 25d));
            add(new Temperatura("Abril", 33d));
            add(new Temperatura("Maio", 21d));
            add(new Temperatura("Junho", 18d));
        }};

        List<Double> soTempsMeses = new ArrayList<>();

        List<Temperatura> temperaturasMaiores = new ArrayList<>();

        Iterator<Temperatura> iter = temperaturas.iterator();
        while(iter.hasNext()){
            Temperatura next = iter.next();
            System.out.println(next);
        }
        
        for (Temperatura temperatura : temperaturas) {
            soTempsMeses.add((Double)temperatura.getTemperatura());
        }

        Double soma = 0d;
        Iterator<Double> iteratorTemperaturasLista = soTempsMeses.iterator(); 
        while(iteratorTemperaturasLista.hasNext()){
            Double next = iteratorTemperaturasLista.next();
            soma += next;
        }

        Double media = soma / temperaturas.size();

        System.out.println("\nOs mêses em que temperatura foi acima da média " +
        "Semestral: ");

        for (Temperatura temp : temperaturas) {
            if(temp.getTemperatura() > media){
                temperaturasMaiores.add(temp);
                System.out.println(temp);
            }
        }
    }
}