package angiprestano.organization_event.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UserDTO(
        String name, String surname, String email, String password) {
}
