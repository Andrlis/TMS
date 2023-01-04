package lesson3.utils;

import java.util.Scanner;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:07
 */
public class ConsoleReader {

    private Scanner scanner = new Scanner(System.in);

    public double readDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Oops! It's not a number.");
            //Skip incorrect input
            scanner.next();
            return 0;
        }
    }

    public String readLine() {
        return scanner.next();
    }

    public int readInt(){
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Oops! It's not a number.");
            scanner.next();
            return 0;
        }
    }

    public void stop(){
        scanner.close();
    }
}
