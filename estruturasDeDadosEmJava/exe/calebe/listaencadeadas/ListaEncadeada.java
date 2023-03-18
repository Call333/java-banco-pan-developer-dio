package exe.calebe.listaencadeadas;

public class ListaEncadeada<T>{
    
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }
    // adicoona nos na lista
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo); 
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }   
    // remove nos da lista
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;

    }


    public int size(){ // Retorna o tamanho da lista 
        int tamanhoLista = 0;
        No<T> refAuxiliar = referenciaEntrada;
        
        while(true){
            if(refAuxiliar != null){
                tamanhoLista++;
                if(refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }else {
                    break;
                }
            }else { 
                break;
            }
        }

        return tamanhoLista;
    }

    // metodo para validar o indice da lista encadeada
    private void validaIndice( int index){
        int ultimoIndice = size() - 1;
        if( index >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    // toString para formatação
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for( int i = 0; i < this.size(); i++){
            strRetorno += "No{conteudo = " + noAuxiliar.getConteudo()  + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        // "No{conteudo = " + referenciaEntrada  + "}";
        return strRetorno;
    }
}
