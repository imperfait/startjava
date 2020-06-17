public class Calculator {
	public static void main(String[] args) {
		int firstNum = 4;
		int secondNum = 9;
		int sum = firstNum;
		char symbol = '%';
		if (symbol == '+') {
			System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + (firstNum + secondNum));
		} else if (symbol == '-') {
			System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + (firstNum - secondNum));
		} else if (symbol == '/') {
			System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + (firstNum / secondNum));
		} else if (symbol == '*') {
			System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + (firstNum * secondNum));
		} else if (symbol == '%') {
			System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + (firstNum % secondNum));
		} else {
			for (int i = secondNum-1; i > 0; i--) {
				sum *= firstNum;
			}
			System.out.println(firstNum+" " + symbol+ " "+secondNum+" = "+ sum);
		}
	}
}