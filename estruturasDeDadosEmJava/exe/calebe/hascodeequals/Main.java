package exe.calebe.hascodeequals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Carro("Ford"));
        listaDeCarros.add(new Carro("Volkswagen"));
        listaDeCarros.add(new Carro("Fiat"));
        listaDeCarros.add(new Carro("Chevrolet"));

        System.out.println(listaDeCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode()); // 
        System.out.println(new Carro("Fiat").hashCode());   

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2)); //false
    }   

}
