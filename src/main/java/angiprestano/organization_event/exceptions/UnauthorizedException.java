package angiprestano.organization_event.exceptions;

public class UnauthorizedException extends RuntimeException{
    public  UnauthorizedException(String message){
        super(message);
    }
}
