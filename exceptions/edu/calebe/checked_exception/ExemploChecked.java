package edu.calebe.checked_exception;

import javax.swing.*;
import java.io.*;

public class ExemploChecked {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "meu-nome.txt";
        try{
            imprimirAquivo(nomeDoArquivo);
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado, " +
            "revise o nome do arquivo " + e.getMessage());
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, " +
            "Entre em contato com o suporte. " + e.getMessage());
        } finally{
            System.out.println("Finally executa mesmo com erro ");
        }   
        

        System.out.println("Apesar da exception ou não, o programa continua");
    }
    public static void imprimirAquivo(String nomeDoArquivo) throws IOException{
        File file = new File(nomeDoArquivo); // procura da raiz

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);

        bw.flush();
        br.close();
    }
}
