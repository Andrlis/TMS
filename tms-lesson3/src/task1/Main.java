package task1;

import java.util.Scanner;

/**
 * @author Andrei Lisouski
 */

/* Simple calculator.
*  Supported operations: sum, sub, mul, div
*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the simple calculator. Supported operations: sum, sub, mul, div");

            float num1;
            float num2;
            String operation;

            System.out.print("Enter first number:\n>>");
            //Check if number was inserted
            if (scanner.hasNextFloat()){
                num1 = scanner.nextFloat();
            }
            else {
                System.out.println("Oops! It's not a number.");
                //Skip incorrect input
                scanner.next();
                continue;
            }

            System.out.print("Enter second number:\n>>");
            if (scanner.hasNextFloat()){
                num2 = scanner.nextFloat();
            }
            else {
                System.out.println("Oops! It's not a number.");
                scanner.next();
                continue;
            }

            System.out.print("Enter operation:\n>>");
            operation = scanner.next();

            float result;
            switch (operation) {
                case "sum":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Unsupported operation!");
                    continue;
            }
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

            System.out.println("Do you want to proceed?(y/n)?");
            String userDecision = scanner.next();
            if (userDecision.equals("n")){
                break;
            }
        }
        scanner.close();
    }
}
