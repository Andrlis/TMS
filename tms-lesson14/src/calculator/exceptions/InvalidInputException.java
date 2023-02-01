package calculator.exceptions;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 25/01/2023 - 1:38
 */
public class InvalidInputException extends Exception{
    public InvalidInputException() {
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }

    public InvalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
