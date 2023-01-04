package lesson3.task4;

import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:40
 */
public class Task4 {
    private ConsoleReader consoleReader = new ConsoleReader();

    public void run() {
        while (true) {
            int input;
            boolean hasDuplicates = false;

            System.out.print("Enter the integer and I'll check if number contains digits duplicates\n>>");
            input = consoleReader.readInt();

            for (; input != 0; input /= 10) {
                int buff = input % 10;
                int reminder = input / 10;

                for (; reminder != 0; reminder /= 10) {
                    if (buff == reminder % 10) {
                        hasDuplicates = true;
                        break;
                    }
                }

                if (hasDuplicates) {
                    break;
                }

            }

            System.out.println(hasDuplicates);
            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = consoleReader.readLine();
            if (userDecision.equals("n")) {
                break;
            }
        }
        consoleReader.stop();
    }
}
