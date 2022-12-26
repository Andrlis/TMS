package task2;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 26/12/2022 - 20:24
 */
public class Main {

    public static void main(String[] args) {

        int[] array = {6, 9, 7, 5, 4, 3, 0, 1};

        System.out.println("Even numbers:");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd numbers:");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
