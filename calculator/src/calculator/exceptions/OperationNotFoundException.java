package calculator.exceptions;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 30/01/2023 - 0:17
 */
public class OperationNotFoundException extends Exception {
    public OperationNotFoundException() {
    }

    public OperationNotFoundException(String message) {
        super(message);
    }

    public OperationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationNotFoundException(Throwable cause) {
        super(cause);
    }

    public OperationNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
