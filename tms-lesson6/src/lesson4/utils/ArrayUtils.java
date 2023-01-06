package lesson4.utils;

import java.util.Arrays;
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

    public int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = randomGenerator.nextInt();
        }
        return array;
    }

    public int[] findMinMaxValues(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        int min = array[0];
        int max = array[0];

        //Start from i=1 due to min/max has been initialized by first element of the massive
        for (int i = 1; i < copiedArray.length; i++) {
            if (copiedArray[i] > max) {
                max = copiedArray[i];
            } else if (copiedArray[i] < min) {
                min = copiedArray[i];
            }
        }
        return new int[]{min, max};
    }

    private int[] addElementToArray(int[] array, int newElement) {
        if (array == null) {
            return new int[]{newElement};
        } else {
            int[] arrayCopy = Arrays.copyOf(array, array.length + 1);
            arrayCopy[arrayCopy.length - 1] = newElement;
            return arrayCopy;
        }
    }

    private String[] addElementToArray(String[] array, String newElement) {
        if (array == null) {
            return new String[]{newElement};
        } else {
            String[] arrayCopy = Arrays.copyOf(array, array.length + 1);
            arrayCopy[arrayCopy.length - 1] = newElement;
            return arrayCopy;
        }
    }

    public int[] findEvenNumbers(int[] array) {
        int[] result = null;
        for (int i : array) {
            if (i % 2 == 0) {
                result = addElementToArray(result, i);
            }
        }
        return result;
    }

    public int[] findOddNumbers(int[] array) {
        int[] result = null;
        for (int i : array) {
            if (i % 2 != 0) {
                result = addElementToArray(result, i);
            }
        }
        return result;
    }

    public int[] findShortLongNumber(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < copiedArray.length - 1; i++) {
            for (int j = i + 1; j < copiedArray.length; j++) {
                if (Math.abs(copiedArray[i]) > Math.abs(copiedArray[j])) {
                    int buf = copiedArray[i];
                    copiedArray[i] = copiedArray[j];
                    copiedArray[j] = buf;
                }
            }
        }
        return new int[]{copiedArray[0], copiedArray[copiedArray.length - 1]};
    }

    public String[] findSequencesOfIncreasingNumbers(int[] array) {
        String[] result = null;
        int i = 0;
        int j = 1;

        StringBuilder stringBuilder = new StringBuilder();

        for (; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 0) {
                j++;
            } else if (j != 1) {
                for (int p = i - j + 1; p <= i; p++) {
                    stringBuilder.append(array[p]).append(" ");
                }
                j = 1;
                result = addElementToArray(result, stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }

        return result;
    }

    private int reverseNumber(int number) {
        int buf = number;
        int reversedNumber = 0;
        for (; buf != 0; buf /= 10) {
            if (reversedNumber != 0) {
                reversedNumber = reversedNumber * 10;
            }
            reversedNumber += buf % 10;
        }

        return reversedNumber;
    }

    public int[] findPalindromicNumbers(int[] array) {
        int[] result = null;

        for (int i : array) {
            int revers = reverseNumber(i);

            if (revers == i && (i / 10 > 0)) {
                result = addElementToArray(result, i);
            }
        }

        return result;
    }
}
