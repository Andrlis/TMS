package lesson5;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 07/01/2023 - 22:15
 */
public class Main {

    public static void main(String[] args) {

        MatrixUtils matrixUtils = new MatrixUtils();
        int[][] matrix = new int[10][10];

        matrix = matrixUtils.initializeMatrix(matrix);
        matrixUtils.printMatrix(matrix);

        matrix = matrixUtils.initializeMatrixByRandomNumbers(matrix);
        matrixUtils.printMatrix(matrix);

        matrix = matrixUtils.initializeMatrixAsTriangle(matrix);
        matrixUtils.printMatrix(matrix);
        matrixUtils.printNonZeroElements(matrix);
    }
}
