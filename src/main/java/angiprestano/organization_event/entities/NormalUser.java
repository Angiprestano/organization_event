package angiprestano.organization_event.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class NormalUser {
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String passowrd;
}
