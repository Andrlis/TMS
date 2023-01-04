package lesson3.task5;

import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:42
 */
public class Task5 {
    private ConsoleReader consoleReader = new ConsoleReader();

    public void run() {
        while (true) {
            int input;
            int result = 0;

            System.out.print("Enter the integer:\n>>");
            input = consoleReader.readInt();

            int buf;
            for (; input != 0; input /= 10) {
                buf = input % 10;
                int reminder = input / 10;

                if (buf - 1 == reminder % 10) {
                    result = result * 10 + buf;
                } else if (result != 0) {
                    result = result * 10 + buf;
                    System.out.println(result);
                    result = 0;
                }
            }

            System.out.println();

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = consoleReader.readLine();
            if (userDecision.equals("n")) {
                break;
            }
        }
        consoleReader.stop();
    }
}
