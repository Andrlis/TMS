package calculator;

import java.util.Scanner;

/**
 * @author Simon Pirko on 9.01.23
 */
public class ConsoleReader implements Reader {

	Scanner scanner = new Scanner(System.in);

	public String readString() {
		return scanner.next();
	}

	public double readDouble() {
		return scanner.nextDouble();
	}
}
