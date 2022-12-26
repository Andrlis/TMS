package task1;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 26/12/2022 - 20:11
 */
public class Main {

    public static void main(String[] args) {

        //int[] array = new int[10];
        int[] array = {6, 9, 7, 5, 4, 3, 0, 1};

        int min = array[0];
        int max = array[0];

        //Start from i=1 due to min/max has been initialized by first element of the massive
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Min: " + min + " Max: " + max);

        //Option 2

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }

        System.out.println("Option 2:");
        System.out.println("Min: " + array[0] + " Max: " + array[array.length-1]);
    }
}
