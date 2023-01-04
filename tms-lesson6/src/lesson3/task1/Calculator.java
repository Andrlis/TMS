package lesson3.task1;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 04/01/2023 - 23:10
 */
public class Calculator {

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        else {
            System.out.println("Division by 0 unsupported!");
            return 0;
        }
    }
}
