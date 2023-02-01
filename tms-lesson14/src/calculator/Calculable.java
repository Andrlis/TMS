package calculator;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 01/02/2023 - 21:15
 */
@FunctionalInterface
public interface Calculable {
    Operation calculate(Operation operation);
}
