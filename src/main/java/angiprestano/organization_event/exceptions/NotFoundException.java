package angiprestano.organization_event.exceptions;

import java.time.LocalDateTime;
import java.util.UUID;

public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID id){
        super("the element id"+id+" not trovated");
    }
    public NotFoundException(String message){
        super(message);
    }
}
