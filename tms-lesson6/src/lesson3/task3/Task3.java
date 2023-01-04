package lesson3.task3;

import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:39
 */
public class Task3 {
    private ConsoleReader consoleReader = new ConsoleReader();

    public void run() {
        while (true) {
            int input;
            int min;
            int max;

            System.out.print("Enter the integer and I'll find min & max digits in it\n>>");
            input = consoleReader.readInt();

            int buff;
            min = max = input % 10;
            for (; input != 0; input /= 10) {
                buff = input % 10;

                if (buff < min) {
                    min = buff;
                } else if (buff > max) {
                    max = buff;
                }

            }

            System.out.println("Min: " + min + " Max: " + max);

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = consoleReader.readLine();
            if (userDecision.equals("n")) {
                break;
            }
        }
        consoleReader.stop();
    }
}
