package exer.exercicioum;

import java.util.Calendar;

public class Mensagem {

    private int pegaHora(){
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        return hora;
    }
   

    public void enviarMensagem(String mensagem){
        if(this.pegaHora() >= 5 && this.pegaHora() < 12){
            System.out.println("Bom dia! " + mensagem);
        } else if(this.pegaHora() >= 12 && this.pegaHora() < 18){
            System.out.println("Boa tarde! " + mensagem);
        }else{
            System.out.println("Boa noite! " + mensagem);
        }
    }
    
}
