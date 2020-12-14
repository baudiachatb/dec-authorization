package b.com.demo.dec.authorizationserver.repository;

import b.com.demo.dec.authorizationserver.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> getUserByUsername(String userName);
}
