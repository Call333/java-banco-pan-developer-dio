
class Carro {
    private String cor, modelo;
    private int capacidadeTanque;
    
    double valor_encher_tanque;

    Carro(){

    }
    Carro(int capacidadeTanque, String modelo, String cor) {
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    
    public double getValor_encher_tanque() {
        return valor_encher_tanque;
    }

    public void encherTanque(double gasolina){
        this.valor_encher_tanque = this.capacidadeTanque * gasolina;
    }

    
}