package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon Pirko on 9.01.23
 */
public class InMemoryOperationStorage implements OperationStorage {
    private List<Operation> operations;

    public InMemoryOperationStorage() {
        this.operations = new ArrayList<>();
    }

    @Override
    public void save(Operation operation) {
        operations.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);
    }
}
