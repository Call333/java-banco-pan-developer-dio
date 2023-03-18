package exe.calebe.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultiumoNo;
     
    private int tamanhoLista;
    // construtor da classe
    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultiumoNo = null;
        this.tamanhoLista = 0;
    }
    // retorna o tamanho da lista
    public int size(){
        return this.tamanhoLista;
    }
    // pega o index da lista
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    // pega o No de um index
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; ( i < index) && ( noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }
    // metódo que adiciona ao final da lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultiumoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultiumoNo != null){
            ultiumoNo.setNoProximo(novoNo);
        }
        ultiumoNo = novoNo;
        tamanhoLista++;
    }
    // adiciona um nó a partir de um index, jutamente de um elemento(Ex.: uma string)
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);;
        }else {
            novoNo.setNoPrevio(ultiumoNo);
            ultiumoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        }else { 
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }
    // metódo para remover um elemento da lista
    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }   
        }else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultiumoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else {
                ultiumoNo = noAuxiliar;
            }   
        }
    
        this.tamanhoLista--;
    }
    // metódo toString para formatação
    public String toString(){
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{onteudo = " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
