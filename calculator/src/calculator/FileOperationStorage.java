package calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 30/01/2023 - 1:58
 */
public class FileOperationStorage implements OperationStorage {
    @Override
    public void save(Operation operation) throws IOException {
        String result = String.format("%s,%s,%s,%s",
                operation.getOperand1(),
                operation.getOperand2(),
                operation.getOperationType().toString(),
                operation.getResult());

        FileOutputStream fileOutputStream =
                new FileOutputStream("history.csv", true);
        fileOutputStream.write(result.getBytes());
        fileOutputStream.write(10);
        fileOutputStream.close();
    }

    @Override
    public List<Operation> findAll() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("history.csv"));
        List<Operation> operations = new ArrayList<>();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            operations.add(convertToOperation(line));
        }

        return operations;
    }

    private Operation convertToOperation(String operation) {
        String[] s = operation.split(",");
        double num1 = Double.parseDouble(s[0]);
        double num2 = Double.parseDouble(s[1]);
        double result = Double.parseDouble(s[3]);
        return new Operation(num1, num2, OperationType.valueOf(s[2]), result);
    }
}
