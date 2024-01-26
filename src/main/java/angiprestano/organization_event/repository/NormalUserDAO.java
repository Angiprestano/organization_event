package angiprestano.organization_event.repository;

import angiprestano.organization_event.entities.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface NormalUserDAO extends JpaRepository<NormalUser, UUID> {
    Optional<NormalUser> findByEmail(String email);
}
