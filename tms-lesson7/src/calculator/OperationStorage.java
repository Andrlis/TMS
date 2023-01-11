package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public interface OperationStorage {
	void save(Operation operation);

	Operation[] findAll();
}
