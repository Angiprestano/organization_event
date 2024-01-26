package angiprestano.organization_event.repository;

import angiprestano.organization_event.entities.AdminEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AdminEventDAO extends JpaRepository<AdminEvent, UUID> {
    Optional<AdminEvent> findByEmail(String email);
}
