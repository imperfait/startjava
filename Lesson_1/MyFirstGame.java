public class MyFirstGame{
	public static void main(String[] args) {
		int numberCpu = 41;
		int guess = 18;
		if (guess > numberCpu){
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if(guess < numberCpu){
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else{
			System.out.println("Вы угадали!");
		};
	}
}