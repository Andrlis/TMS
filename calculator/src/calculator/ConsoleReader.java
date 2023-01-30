package calculator;

import calculator.exceptions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Simon Pirko on 9.01.23
 */
public class ConsoleReader implements Reader {

    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.next();
    }

    public double readDouble() throws InvalidInputException {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        throw new InvalidInputException("Non Double input.");
    }

    public OperationType readOperationType() throws OperationNotFoundException {
        String next = scanner.next();
        String userInput = next.trim().toUpperCase();

        for (OperationType operationType : OperationType.values()) {
            if (userInput.equals(operationType.toString())) {
                return operationType;
            }
        }
        throw new OperationNotFoundException("Unsupported operation: " + userInput);
    }
}
