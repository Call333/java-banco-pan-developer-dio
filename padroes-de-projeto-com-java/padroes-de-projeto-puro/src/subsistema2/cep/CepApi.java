package subsistema2.cep;

public class CepApi {
    
    private static CepApi instancia = new CepApi();;

    private CepApi(){
    
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperaCidade(String cep){
        return "Maceió";
    }

    public String recuperaEstado(String cep){
        return "Alagoas";
    }

}
