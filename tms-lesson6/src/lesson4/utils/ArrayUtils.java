package lesson4.utils;

import java.util.Random;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 06/01/2023 - 02:12
 */
public class ArrayUtils {

    private Random randomGenerator = new Random();
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        return array;
    }

    public int[] initializeArray(int size){
        int[] array = new int[size];
        for (int i=0; i<size;i++){
            array[i]=randomGenerator.nextInt();
        }
        return array;
    }

    public int[] findMinMaxValues(int[] array){
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
        return new int[]{min, max};
    }
}
