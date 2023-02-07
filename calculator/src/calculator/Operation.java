package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class Operation {

    private double operand1;
    private double operand2;
    private OperationType operationType;
    private double result;

    public Operation(double operand1, double operand2, OperationType operationType) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operationType = operationType;
    }

    public Operation(double operand1, double operand2, OperationType operationType, double result) {
        this(operand1, operand2, operationType);
        this.result = result;
    }

    public Operation() {
    }

    public double getOperand1() {
        return this.operand1;
    }

    public double getOperand2() {
        return this.operand2;
    }

    public OperationType getOperationType() {
        return this.operationType;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operand1=" + this.operand1 +
                ", operand2=" + this.operand2 +
                ", type='" + this.operationType.toString() + '\'' +
                ", result=" + this.result +
                '}';
    }
}
