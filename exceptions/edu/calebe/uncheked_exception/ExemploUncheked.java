

import javax.swing.*;

public class ExemploUncheked {
    public static void main(String[] args) {

        boolean loop = true;

        do{
            String a = JOptionPane.showInputDialog("Numerador: " );
            String b = JOptionPane.showInputDialog("Numerador: " );
    
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b) );
                System.out.println("Resultado: " + resultado);
                loop = false;   
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, Insira apenas números inteiros! " + e.getMessage());
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por zero" + e.getMessage());
            }finally{
                // bloco opcional, será executado independente de erro         
            }
    
        }while(loop);
    
        System.out.println("Terminou o main");
    }

    public static int dividir(int a, int b) { return a / b; };
}
