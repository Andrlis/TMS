package task3;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 29/12/2022 - 16:56
 */
public class Main {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        int[][] array2 = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j <= i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j <= i) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}



