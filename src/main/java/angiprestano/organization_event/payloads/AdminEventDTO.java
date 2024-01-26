package angiprestano.organization_event.payloads;

import java.time.LocalDate;
import java.util.UUID;

public record AdminEventDTO(String name, String surname, String email, String password) {
}
