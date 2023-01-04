package lesson3;

import lesson3.task1.Task1;
import lesson3.task2.Task2;
import lesson3.task3.Task3;
import lesson3.task4.Task4;
import lesson3.task5.Task5;
import lesson3.utils.ConsoleReader;

/**
 * @author Andrei Lisouski (Andrlis)
 * @created 05/01/2023 - 0:43
 */
public class Main {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();

        String userInput;

        System.out.println("Please select a task:\n1 - Task1\n2 - Task2\n3 - Task3\n4 - Task4\n5 - Task5");
        userInput = consoleReader.readLine();

        switch (userInput) {
            case "1":
                task1.run();
                break;
            case "2":
                task2.run();
                break;
            case "3":
                task3.run();
                break;
            case "4":
                task4.run();
                break;
            case "5":
                task5.run();
                break;
            default:
                System.out.println("Unsupported operation!");
        }
    }
}
