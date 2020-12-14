package b.com.demo.dec.authorizationserver.repository;

import b.com.demo.dec.authorizationserver.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
}
