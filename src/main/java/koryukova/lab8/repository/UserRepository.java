package koryukova.lab8.repository;

import koryukova.lab8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
