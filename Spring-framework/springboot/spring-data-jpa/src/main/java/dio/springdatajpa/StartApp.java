package dio.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springdatajpa.dio.model.User;
import dio.springdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Calebe");
        user.setUsername("Call");
        user.setPassword("root");

        repository.save(user);  
        

        for(User u : repository.findAll()){
            System.out.println(u);
        }
    }
    
}
