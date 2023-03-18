package exe.calebe.stack;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push( new Carro("Ford"));
        stackCarros.push( new Carro("Fiat"));
        stackCarros.push( new Carro("Chevrolet"));
        
        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); // tira o ultimo da stack
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); // exibi o objeto do topo da stack
        System.out.println(stackCarros);
    }   

}
