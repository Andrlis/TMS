package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class ConsoleApplication implements Application {

	OperationStorage storage = new InMemoryOperationStorage(10);

	Calculator calculator = new Calculator();

	Reader reader = new ConsoleReader();

	Writer writer = new ConsoleWriter();

	public void run() {
		while (true) {
			writer.write("Enter num 1");
			double num1 = reader.readDouble();
			writer.write("Enter num 2");
			double num2 = reader.readDouble();
			writer.write("Enter operation type");
			String type = reader.readString();
			Operation op = new Operation(num1, num2, type);
			Operation result = calculator.calculate(op);
			storage.save(result);
			writer.write("Result = " + result.result);
			writer.write("");
			Operation[] all = storage.findAll();
		}
	}
}
