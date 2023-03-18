package edu.calebe.metodos;

public class Usuario {
    public static void main(String[] args) {
        MeuMetodo smartTv = new MeuMetodo();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.mudarDeCanal(34);

        System.out.println("A Tv está ligada: " + smartTv.ligada);
        System.out.println("A Tv está no canal: " + smartTv.canal);
        System.out.println("A Tv está com volume: " + smartTv.volume);

    
        smartTv.ligar();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Desligando a TV: " + smartTv.ligada);

        
    }
}
