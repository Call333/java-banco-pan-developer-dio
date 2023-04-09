
import dio.calebe.gof.facade.Facade;
import dio.calebe.gof.singleton.SingletonEager;
import dio.calebe.gof.singleton.SingletonLazy;
import dio.calebe.gof.singleton.SingletonLazyHolder;
import dio.calebe.gof.strategy.ComportamentoAgressivo;
import dio.calebe.gof.strategy.ComportamentoDefensivo;
import dio.calebe.gof.strategy.ComportamentoNormal;
import dio.calebe.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo aefensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(aefensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrar("Calebe", "13001780");
    }
}
