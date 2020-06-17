public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 8;
		int attempt = 30;

		do {
			if (attempt > guess) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				attempt--;
			} else if (attempt < guess) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				attempt++;
			}
		} while (attempt != guess);

		System.out.println("Вы угадали!");
	}
}