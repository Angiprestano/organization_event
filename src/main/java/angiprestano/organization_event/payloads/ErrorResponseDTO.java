package angiprestano.organization_event.payloads;

import java.util.Date;
import java.util.List;

public record ErrorResponseDTO(String message, Date timestamp, List<String> errorList) {
}
