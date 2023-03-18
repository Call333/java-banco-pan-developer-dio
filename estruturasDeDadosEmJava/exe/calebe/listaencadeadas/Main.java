package exe.calebe.listaencadeadas;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Teste 01");
        minhaListaEncadeada.add("Teste 02");
        minhaListaEncadeada.add("Teste 03");
        minhaListaEncadeada.add("Teste 04");


        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.remove(2));
        System.out.println(minhaListaEncadeada);
    }
}
