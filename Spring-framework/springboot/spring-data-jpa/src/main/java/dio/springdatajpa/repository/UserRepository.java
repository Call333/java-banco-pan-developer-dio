package dio.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.springdatajpa.dio.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
