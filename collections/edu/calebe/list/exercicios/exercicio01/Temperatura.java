package edu.calebe.list.exercicios.exercicio01;

public class Temperatura {
    private String mes;
    private double temperatura;

    Temperatura(String mes, double temperatura){
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return mes + " | " + temperatura + " C°";
    }
}
