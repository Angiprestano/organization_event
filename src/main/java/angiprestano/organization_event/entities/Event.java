package angiprestano.organization_event.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Event {
    private UUID id;
    private String title;
    private String description;
    private LocalDate date;
    private String place;
    private int disponibiliySeatNumber;
    @ManyToMany
    @JoinTable(name = "eventUser",
    joinColumns = @JoinColumn(name = "eventId"), inverseJoinColumns = @JoinColumn(name = "userId")
    )
    private Set<NormalUser> partecipants;
}
