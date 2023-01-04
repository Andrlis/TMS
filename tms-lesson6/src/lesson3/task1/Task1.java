package lesson3.task1;

import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:14
 */
public class Task1 {

    private Calculator calculator = new Calculator();
    private ConsoleReader consoleReader = new ConsoleReader();

    public void run() {
        while (true) {
            System.out.println("Welcome to the simple calculator. Supported operations: sum, sub, mul, div");

            double num1;
            double num2;
            String operation;

            System.out.print("Enter first number:\n>>");
            num1 = consoleReader.readDouble();

            System.out.print("Enter second number:\n>>");
            num2 = consoleReader.readDouble();

            System.out.print("Enter operation:\n>>");
            operation = consoleReader.readLine();

            double result;
            switch (operation) {
                case "sum":
                    result = calculator.sum(num1, num2);
                    break;
                case "sub":
                    result = calculator.sub(num1, num2);
                    break;
                case "mul":
                    result = calculator.mul(num1, num2);
                    ;
                    break;
                case "div":
                    result = calculator.div(num1, num2);
                    break;
                default:
                    System.out.println("Unsupported operation!");
                    continue;
            }
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = consoleReader.readLine();
            if (userDecision.equals("n")) {
                break;
            }
        }
        consoleReader.stop();
    }
}
