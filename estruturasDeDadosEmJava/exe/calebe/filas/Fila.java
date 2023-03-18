package exe.calebe.filas;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    } // se a fila estiver fazia, retorne true, caso não, false;

    public void enqueue(T object){
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue(){
            if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    

    public T first(){
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public String toString(){
        String stringRetorno = "";
        No<T> noAuxilar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{Objeto = " + 
                noAuxilar.getObject() +
                "}]--->";
                
                if(noAuxilar.getRefNo() != null){
                    noAuxilar = noAuxilar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;  
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
