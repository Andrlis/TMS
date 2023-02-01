package calculator;

import calculator.OperationType.*;

/**
 * @author Simon Pirko on 9.01.23
 */
public class Calculator {

	private Operationable calculatorOperation;

	Operation calculate(Operation operation) {
		switch (OperationType.valueOf(operation.getOperationType())) {
			case SUM:
				calculatorOperation = (operand1, operand2) -> operand1 + operand2;
				operation.setResult(calculatorOperation.operate(operation.getOperand1(), operation.getOperand2()));
				return operation;
			case SUB:
				calculatorOperation = (operand1, operand2) -> operand1 - operand2;
				operation.setResult(calculatorOperation.operate(operation.getOperand1(), operation.getOperand2()));
				return operation;
			case MUL:
				calculatorOperation = (operand1, operand2) -> operand1 * operand2;
				operation.setResult(calculatorOperation.operate(operation.getOperand1(), operation.getOperand2()));
				return operation;
			case DIV:
				calculatorOperation = (operand1, operand2) -> operand1 / operand2;
				operation.setResult(calculatorOperation.operate(operation.getOperand1(), operation.getOperand2()));
				return operation;
		}
		return operation;
	}
}
