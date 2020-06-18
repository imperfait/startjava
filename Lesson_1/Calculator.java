public class Calculator {
	public static void main(String[] args) {
		int firstNum = 3;
		int secondNum = 8;
		char sign = '^';

		if (sign == '+') {
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + (firstNum + secondNum));
		} else if (sign == '-') {
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + (firstNum - secondNum));
		} else if (sign == '/') {
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + (firstNum / secondNum));
		} else if (sign == '*') {
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + (firstNum * secondNum));
		} else if (sign == '%') {
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + (firstNum % secondNum));
		} else {
			int pow = 1;

			for (int i = secondNum; i > 0; i--) {
				pow *= firstNum;
			}
			System.out.println(firstNum + " " + sign + " " + secondNum + " = " + pow);
		}
	}
}