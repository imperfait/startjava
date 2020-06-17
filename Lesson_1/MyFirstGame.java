public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 8;
		int attempt = 30;

		do {
			if (attempt > guessedNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				attempt--;
			} else if (attempt < guessedNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				attempt++;
			}
		} while (attempt != guessedNumber);

		System.out.println("Вы угадали!");
	}
}