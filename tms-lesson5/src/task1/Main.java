package task1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 29/12/2022 - 16:27
 */
public class Main {

    public static void main(String[] args) {

        final Random random = new Random();

        int[][] array1 = new int[10][10];
        int[][] array2 = new int[10][10];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = 10 * i + j;
            }
        }

        System.out.println(Arrays.deepToString(array1));

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(99) + 1;
            }
        }

        System.out.println(Arrays.deepToString(array2));
    }
}
