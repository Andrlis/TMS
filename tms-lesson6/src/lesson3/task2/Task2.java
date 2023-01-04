package lesson3.task2;

import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:33
 */
public class Task2 {
    private ConsoleReader consoleReader = new ConsoleReader();

    public void run() {
        while (true) {
            int input;
            int result = 0;

            System.out.print("Enter the integer and I'll reverse it\n>>");
            input = consoleReader.readInt();

            for (; input != 0; input /= 10) {
                if (result != 0) {
                    result = result * 10;
                }
                result += input % 10;
            }

            System.out.println("Result: " + result);
            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = consoleReader.readLine();
            if (userDecision.equals("n")) {
                break;
            }
        }
        consoleReader.stop();
    }
}
