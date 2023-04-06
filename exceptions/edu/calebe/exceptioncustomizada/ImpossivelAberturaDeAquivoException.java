package edu.calebe.exceptioncustomizada;

public class ImpossivelAberturaDeAquivoException extends Exception {
    
    private  String nome;
    private String diretorio;

    ImpossivelAberturaDeAquivoException(String nome, String diretorio){
        super("O arquivo " + nome + " não foi encontrado no diretório " + diretorio);
        this.nome = nome;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeAquivoException{" + 
        "Nome do Arquivo: " + nome +
        "diretório: " + diretorio + 
        "}";
    }

}
