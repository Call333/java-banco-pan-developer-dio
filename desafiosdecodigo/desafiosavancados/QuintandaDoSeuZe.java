import java.util.*;

public class QuintandaDoSeuZe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();// em Kg
        int macas = input.nextInt();

        double total_pagar = 0d;
        
        double valor_morangos = 0d;
        double valor_macas = 0d;

        if(morangos <= 5){
            valor_morangos = morangos * 2.5d;
        }else{
            valor_morangos = morangos * 2.2d;
        }

        if(macas <= 5){
            valor_macas = macas * 1.8d;
        }else{
            valor_macas = macas * 1.5d;
        }

        if(total_pagar > 25 || (morangos + macas) > 8){
            total_pagar = (valor_macas + valor_morangos) * 0.9d;
        }else{
            total_pagar = valor_macas + valor_morangos;
        }

        System.out.println(total_pagar);

        input.close();
    }
}
