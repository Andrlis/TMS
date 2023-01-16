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

    private Operation[] sortOperationsByAppearance(){
        Operation[] sortedOperations = new Operation[this.operations.length];
        for(int i = 0; i<sortedOperations.length; i++ ){
            //System.out.println(this.nextOperationIndex);
            //System.out.println("i: " + String.valueOf(i) + "j: " + String.valueOf(Math.abs(this.nextOperationIndex + i - this.operations.length)));
            sortedOperations[i] = this.operations[getPosition(i)];
        }
        return sortedOperations;
    }

    private int getPosition(int i){
        return ((this.nextOperationIndex - 1 - i) >= 0) ? (this.nextOperationIndex - 1 - i) : this.operations.length + (this.nextOperationIndex - 1 - i);
    }
    @Override
    public Operation[] findAll() {
        return this.sortOperationsByAppearance();
    }
}
