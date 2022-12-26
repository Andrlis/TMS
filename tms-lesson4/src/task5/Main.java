package task5;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 26/12/2022 - 21:38
 */
public class Main {

    public static void main(String[] args) {

        int[] array = {-6, 9, 454, 55657, 3434, 2552, 10, 1};

        for (int i: array){
            int buf = i;
            int revers = 0;
            for (; buf != 0; buf /= 10) {
                if (revers != 0) {
                    revers = revers * 10;
                }
                revers += buf % 10;
            }

            //System.out.println(revers);

            if (revers == i && (i / 10 > 0)) {
                System.out.println(i);
            }
        }
    }
}
