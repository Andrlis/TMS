package task3;


import java.util.Arrays;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 26/12/2022 - 21:15
 */
public class Main {
    public static void main(String[] args) {

        int[] array = {-6, 9, 77, 55657, 3434, 123, 10, 1};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = Math.abs(array[i]);
        }

        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] > array2[j]) {
                    int buf = array2[i];
                    array2[i] = array2[j];
                    array2[j] = buf;
                }
            }
        }

        System.out.println(array2[0]);
        System.out.println(array2[array2.length-1]);
    }
}
