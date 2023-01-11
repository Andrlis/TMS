package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class ConsoleWriter implements Writer {

	public void write(String message) {
		System.out.println(message);
	}
}
