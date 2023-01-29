package calculator;

import java.io.*;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 30/01/2023 - 1:58
 */
public class FileOperationStorage {

    public void save(Operation operation) throws IOException {
        String result = String.format("%s,%s,%s,%s",
                operation.getOperand1(),
                operation.getOperand2(),
                operation.getOperationType(),
                operation.getResult());

        FileOutputStream fileOutputStream =
                new FileOutputStream("history.csv", true);
        fileOutputStream.write(result.getBytes());
        fileOutputStream.write(10);
        fileOutputStream.close();
    }

    public Operation[] findAll() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("history.csv"));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(convertToOperation(line));
        }
        return null;
    }

    private Operation convertToOperation(String operation) {
        String[] s = operation.split(",");
        double num1 = Double.parseDouble(s[0]);
        double num2 = Double.parseDouble(s[1]);
        double result = Double.parseDouble(s[2]);
        return new Operation(num1, num2, s[3], result);
    }
}
