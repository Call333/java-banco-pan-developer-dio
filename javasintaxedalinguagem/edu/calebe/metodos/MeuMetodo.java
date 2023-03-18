package edu.calebe.metodos;

public class MeuMetodo {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarDeCanal(){
        canal++;
    }

    public void diminuirDeCanal(){
        canal--;
    }

    public void mudarDeCanal(int novoCanal){
        this.canal = novoCanal;
    }
}