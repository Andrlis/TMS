package task3;

import java.util.Scanner;

/**
 * @author Andrei Lisouski
 */

/*
 *  Print min & max digits from the number
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input;
            int min;
            int max;

            System.out.print("Enter the integer and I'll find min & max digits in it\n>>");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                System.out.println("Oops! It's not a number.");
                scanner.next();
                continue;
            }

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
            String userDecision = scanner.next();
            if (userDecision.equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}
