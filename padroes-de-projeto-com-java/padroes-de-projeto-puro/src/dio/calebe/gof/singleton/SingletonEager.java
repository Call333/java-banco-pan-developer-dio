package dio.calebe.gof.singleton;

// Singleton Eager

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager(){
    
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
