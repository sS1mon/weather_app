package project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.app.model.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByUsername(String username);
}
