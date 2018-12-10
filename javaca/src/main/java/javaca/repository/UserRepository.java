package javaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaca.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
