package dio.primeirospasos.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Agr isso é um componente, assim como calculadora
public class MyApp implements CommandLineRunner{
    
    @Autowired // Cria um objeto calculadora, sem usar o New
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: " + calculadora.somar(1, 3));
    }
    
}
