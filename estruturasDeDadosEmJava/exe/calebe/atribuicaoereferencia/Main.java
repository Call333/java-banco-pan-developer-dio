package exe.calebe.atribuicaoereferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("A: " + intA + "\nB: " + intB);

        intA = 2;  
        // aqui simplestemen

        System.out.println("A: " + intA + "\nB: " + intB);

        MeuObjeto a = new MeuObjeto(1);
        MeuObjeto b = a;

        System.out.println("A: " + a + "\nB: " + b);

        a.setNum(2);

        System.out.println("A: " + a + "\nB: " + b);
        // atribui a referencia de memória, 
        // as duas instancias estão apotnando para o mesmo endereço de memória
    }
}
