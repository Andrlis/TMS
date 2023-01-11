package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class InMemoryOperationStorage implements OperationStorage {
    private Operation[] operations;
    private int nextOperationIndex;

    public InMemoryOperationStorage(int storageSize) {
        this.operations = new Operation[storageSize];
        this.nextOperationIndex = 0;
    }

    public void save(Operation operation) {
        if (nextOperationIndex >= this.operations.length) {
            this.nextOperationIndex = 0;
        }
        this.operations[nextOperationIndex] = operation;
        this.nextOperationIndex++;
    }

    @Override
    public Operation[] findAll() {
        return operations;
    }
}
