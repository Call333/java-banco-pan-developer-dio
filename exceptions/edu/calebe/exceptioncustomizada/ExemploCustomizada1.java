package edu.calebe.exceptioncustomizada;

import javax.swing.*;
import java.io.*;

public class ExemploCustomizada1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Informe o nome do arquivo a ser lido: ");

        imprimirAquivo(nomeDoArquivo);
        System.out.println("Apesar da exception ou não, o programa continua");

    }

    public static void imprimirAquivo(String nomeDoArquivo){

        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
    
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while(line != null);
    
            bw.flush();
            br.close();
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro inesperado, fal com o suporte. " + e.getMessage());
        } catch (ImpossivelAberturaDeAquivoException e){
            JOptionPane.showMessageDialog(null, 
                    e.getMessage());
        }
    
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeAquivoException {
        File file = new File( nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeAquivoException(file.getName(), file.getPath());
        }
    }
}
