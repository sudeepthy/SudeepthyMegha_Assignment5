package LiveSessionAssign3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner objScan = new Scanner(System.in);
		int a, b, choice;
		System.out.println("Enter first number");
		a = objScan.nextInt();
		System.out.println("Enter second number");
		b = objScan.nextInt();
		System.out.println("Menu");
		System.out.println("*********************");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Absolute");
		System.out.println("6. Power");
		System.out.println("Enter your choice(1-6)");
		choice = objScan.nextInt();
		IPrinter objPrin = (result) -> System.out.println("Result: " + result);
		switch (choice) {
		case 1:
			ICalculator additionOp = (number1, number2) -> number1 + number2;
			objPrin.print("Sum function result: " + additionOp.operate(a, b));
			break;
		case 2:
			ICalculator subtractionOp = (number1, number2) -> number1 - number2;
			objPrin.print("Subtract function result: " + subtractionOp.operate(a, b));
			break;
		case 3:
			ICalculator multiplicationOp = (number1, number2) -> number1 * number2;
			objPrin.print("Multiply function result: " + multiplicationOp.operate(a, b));
			break;
		case 4:
			ICalculator divisionOp = (number1, number2) -> number1 / number2;
			objPrin.print("Division function result: " + divisionOp.operate(a, b));
			break;
		case 5:
			ICalculator absOp = (number1, number2) -> number1 < 0 ? (number1 * (-1)) : number1;
			objPrin.print("Absolute function result: " + absOp.operate(a, b));
			break;
		case 6:
			ICalculator power = (number1, number2) -> {
				int val = 1;
				if (number2 < 0) {
					number2 = number2 * (-1);
				}
				for (int i = 0; i < number2; i++) {
					val = val * number1;
				}
				return val;
			};
			objPrin.print("Power function result: " + power.operate(a, b));
			break;
		}

	}

}
