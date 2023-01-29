package calculator;

import calculator.exceptions.*;

/**
 * @author Simon Pirko on 9.01.23
 */
public interface Reader {
	String readString();
	double readDouble() throws InvalidInputException;
	OperationType readOperationType() throws OperationNotFoundException;
}
