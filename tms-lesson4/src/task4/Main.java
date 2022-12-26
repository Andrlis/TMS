package task4;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 26/12/2022 - 20:34
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 6, 1, 11, 56, 13};

        int i = 0;
        int j = 1;
        for (; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 0) {
                j++;
            } else if (j != 1) {
                for (int p = i - j + 1; p <= i; p++) {
                    System.out.print(array[p]);
                }
                j = 1;
                System.out.println();
            }
        }
    }
}
