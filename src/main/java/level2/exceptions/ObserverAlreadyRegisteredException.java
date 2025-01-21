package level2.exceptions;

public class ObserverAlreadyRegisteredException extends RuntimeException {
    public ObserverAlreadyRegisteredException(String message) {
        super(message);
    }
}
