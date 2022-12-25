package task5;

import java.util.Scanner;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 25/12/2022 - 0:48
 */

/*
 Print reversed sequence of consecutive digits from the number
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input;
            int result = 0;

            System.out.print("Enter the integer:\n>>");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                System.out.println("Oops! It's not a number.");
                scanner.next();
                continue;
            }

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
            String userDecision = scanner.next();
            if (userDecision.equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}
