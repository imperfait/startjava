public class ConditionalStatement{
	public static void main(String[] args) {
		short age = 21;
		boolean woman = false;
		float height = 1.9f;
		char firstNameLetter = 'A';
		
		if (age > 20) {
			System.out.println("You are over 20");
		}

		if (!woman) {
			System.out.println("You are man");
		}

		if (height < 1.8) {
			System.out.println("You are below 1.8");
		} else {
			System.out.println("You are above 1.8");
		}

		if (firstNameLetter == 'M') {
			System.out.println("First word of your name is M");
		} else if (firstNameLetter == 'И') {
			System.out.println("First word of your name is И");
		} else {
			System.out.println("First word of your name is not M or И");
		}
	}
}