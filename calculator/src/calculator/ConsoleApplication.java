package calculator;

import calculator.exceptions.InvalidInputException;
import calculator.exceptions.OperationNotFoundException;

import java.util.List;

/**
 * @author Simon Pirko on 9.01.23
 */
public class ConsoleApplication implements Application {

    private OperationStorage storage = new FileOperationStorage();
    private Calculator calculator = new Calculator();
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();

    public void run() {
        while (true) {
            showMenu();
            String userInput = reader.readString();

            switch (userInput) {
                case "0":
                    return;
                case "1":
                    try {
                        Operation operation = readOperation();

                        calculator.calculate(operation);
                        storage.save(operation);
                        writer.write("Result = " + operation.getResult());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    try {
                        printOperationHistory(storage.findAll());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    writer.write("Unsupported operation");
            }

        }
    }

    private void showMenu() {
        writer.write("Please, choose an option:\n1 - Calculate\n2 - Show history\n0 - Finish");
    }

    private void printOperationHistory(List<Operation> operations) {
        for (Operation operation : operations) {
            writer.write(operation.toString());
        }
    }

    //Read operation from input stream
    private Operation readOperation() throws InvalidInputException, OperationNotFoundException {
        writer.write("Enter operand 1:");
        double operand1 = reader.readDouble();
        writer.write("Enter operand 2:");
        double operand2 = reader.readDouble();
        writer.write("Enter operation type:");
        OperationType operationType = reader.readOperationType();

        return new Operation(operand1, operand2, operationType.toString());
    }
}
