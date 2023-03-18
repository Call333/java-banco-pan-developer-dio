package exe.calebe.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Carro> filaCarros = new LinkedList<>();
        
        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Chevrolet"));
        filaCarros.add(new Carro("Hyundai"));
        filaCarros.add(new Carro("Fiat"));

        System.out.println(filaCarros.add(new Carro("Nissan"))); // se nao conseguir adiconar retorna erro
        System.out.println(filaCarros);

        System.out.println(filaCarros.offer(new Carro("Renaut"))); // adiciona, mas retorna false ou true, caso consiga adionar
        System.out.println(filaCarros);

        System.out.println(filaCarros.peek()); // consulta o primeiro objeto da fila
        System.out.println(filaCarros);

        System.out.println(filaCarros.poll()); // retira o primeiro elemento
        System.out.println(filaCarros);

        System.out.println(filaCarros.isEmpty()); // diz se a fila está vazia ou não

        System.out.println(filaCarros.size()); // tamanho


    }   

}
