package angiprestano.organization_event.payloads;

import java.time.LocalDate;

public record EventDTO(String title, String description, LocalDate date, String place, Integer disponibilySeatNumber) {
}
