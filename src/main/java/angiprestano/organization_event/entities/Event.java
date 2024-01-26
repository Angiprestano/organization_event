package angiprestano.organization_event.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "events")
@Getter
@Setter
@ToString
public class Event {
    @Id
    @GeneratedValue
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
