package lesson4;

import lesson4.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 06/01/2023 - 23:40
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtils arrayUtils = new ArrayUtils();

//        int[] array = arrayUtils.initializeArray(10);
        int[] array = {-6, 9, 454, 55657, 3434, 2552, 10, 1};
        System.out.println("Initial array: " + Arrays.toString(array));

        while (true) {

            System.out.println("Please select a task:\n1 - Task1\n2 - Task2\n3 - Task3\n4 - Task4\n5 - Task5\n0 - Stop");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    int[] result1 = arrayUtils.findMinMaxValues(array);
                    System.out.println("Min:" + result1[0] + " Max: " + result1[1]);
                    break;
                case "2":
                    int[] evenNumbers = arrayUtils.findEvenNumbers(array);
                    int[] oddNumbers = arrayUtils.findOddNumbers(array);
                    if (evenNumbers != null) {
                        System.out.println("Even numbers:" + Arrays.toString(evenNumbers));
                    }
                    if (oddNumbers != null) {
                        System.out.println("Odd numbers:" + Arrays.toString(oddNumbers));
                    }
                    break;
                case "3":
                    int[] result3 = arrayUtils.findShortLongNumber(array);
                    System.out.println("Shortest:" + result3[0] + " Longest: " + result3[1]);
                    break;
                case "4":
                    String[] result4 = arrayUtils.findSequencesOfIncreasingNumbers(array);
                    if (result4 != null) {
                        System.out.println("Sequences of increasing numbers:" + Arrays.toString(result4));
                    }
                    break;
                case "5":
                    int[] palindromicNumbers = arrayUtils.findEvenNumbers(array);
                    if (palindromicNumbers != null) {
                        System.out.println("Palindromic numbers:" + Arrays.toString(palindromicNumbers));
                    }
                    break;
                case "0":
                    scanner.close();
                    return;
                default:
                    System.out.println("Unsupported operation!");
                    scanner.close();
                    return;
            }
        }

    }
}
