package task4;

import java.util.Scanner;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 24/12/2022 - 22:58
 */

/*
 * Check if number contains digits duplicates
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input;

            System.out.print("Enter the integer and I'll check if number contains digits duplicates\n>>");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                System.out.println("Oops! It's not a number.");
                scanner.next();
                continue;
            }

            for (; input != 0; input /= 10) {
                int buff = input % 10;
                int reminder = input / 10;

                for (; reminder != 0; reminder /= 10) {
                    if (buff == reminder % 10){
                        System.out.println(true);
                        return;
                    }
                }
            }

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = scanner.next();
            if (userDecision.equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}
