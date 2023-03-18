

public class NomeCompleto {
    public static void main(String[] args) {
    
        String firstName = "Calebe";
        String secondName = "Almeida";
        String nomeCompleto = nomeCompleto(firstName, secondName);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto( String firstName, String SecondName){
        return  "RESULTADO DO MÉTODO    " + firstName.concat(" ") + SecondName;
    }
}