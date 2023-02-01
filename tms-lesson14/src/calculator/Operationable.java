package calculator;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 01/02/2023 - 21:24
 */
@FunctionalInterface
public interface Operationable {
    double operate(double operand1, double operand2);
}
