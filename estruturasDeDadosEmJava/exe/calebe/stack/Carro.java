package exe.calebe.stack;

import java.util.Objects;

public class Carro {
    
    String marca;

    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return true;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    public int hashCode(){
        return Objects.hash(marca);
    }

    public String toString(){
        return "Carro{marca = " + marca + "'\'" + "}";
    }

}
