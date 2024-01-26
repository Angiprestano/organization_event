package angiprestano.organization_event.entities;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

public class Event {
    private UUID id;
    private String title;
    private String description;
    private LocalDate date;
    private String place;
    private int disponibiliySeatNumber;
}
