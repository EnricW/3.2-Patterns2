package level2.exceptions;

public class InvalidStockMarketStatusException extends RuntimeException {
    public InvalidStockMarketStatusException(String message) {
        super(message);
    }
}
