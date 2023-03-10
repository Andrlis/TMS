package task2;

import java.util.Scanner;

/**
 * @author Andrei Lisouski
 */

/*
 *  Print number in reverse format
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int input;
            int result = 0;

            System.out.print("Enter the integer and I'll reverse it\n>>");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                System.out.println("Oops! It's not a number.");
                scanner.next();
                continue;
            }

            for (; input != 0; input /= 10) {
                if (result != 0) {
                    result = result * 10;
                }
                result += input % 10;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = scanner.next();
            if (userDecision.equals("n")){
                break;
            }
        }
        scanner.close();
    }
}
