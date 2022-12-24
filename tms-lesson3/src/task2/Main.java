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
        int input = 0;
        int result = 0;

        System.out.print("Enter the integer and I'll reverse it\n>>");
        if (scanner.hasNextInt()){
            input = scanner.nextInt();
        }
        else {
            System.out.println("Oops! It's not a number.");
            scanner.next();
        }

        while(input != 0){
            if (result != 0){
                result = result * 10;
            }
            result = result + input%10;
            input = input/10;
        }

        System.out.println("Result " + result);
        scanner.close();
    }
}
