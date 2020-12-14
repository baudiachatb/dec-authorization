package b.com.demo.dec.authorizationserver.repository;

import b.com.demo.dec.authorizationserver.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<Permission, Integer> {
}
