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
			showMenu();
			String userInput = reader.readString();
			switch (userInput){
				case "0":
					return;
				case "1":
					writer.write("Enter num 1");
					double num1 = reader.readDouble();
					writer.write("Enter num 2");
					double num2 = reader.readDouble();
					writer.write("Enter operation type");
					String type = reader.readString();
					Operation op = new Operation(num1, num2, type);
					Operation result = calculator.calculate(op);
					storage.save(result);
					writer.write("Result = " + result.getResult());
					writer.write("");
					break;
				case "2":
					printOperationHistory(storage.findAll());
					break;
				default:
					writer.write("Unsupported operation");
			}

		}
	}

	private void showMenu() {
		writer.write("Please, choose an option:\n1 - Calculate\n2 - Show history\n0 - Finish");
	}

	private void printOperationHistory(Operation[] operations) {
		for (Operation operation: operations){
			if(operation != null) {
				writer.write(operation.toString());
			}
		}
	}
}
