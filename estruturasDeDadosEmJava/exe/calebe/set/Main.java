package exe.calebe.set;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeu"));
        hashSetCarros.add(new Carro("Peugeot"));


        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeu"));
        treeSetCarros.add(new Carro("Peugeot"));

        System.out.println(treeSetCarros);

        
    }
}
