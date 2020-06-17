public class Cycle {
	public static void main(String[] args) {
		for (int counter = 0; counter <= 20; counter++) {
			System.out.print(counter + " ");
		}
		System.out.println();

		int k = 6;
		while (k >= -6) {
			System.out.print(k+" ");
			k -= 2;
		}
		System.out.println();

		int l = 10;
		int sum = 0;
		do {
			if(l % 2 == 1){
				sum += l;
			}
			l++;
		} while(l <= 20);
		System.out.print(sum);
	}
}