public class Cycle{
	public static void main(String[] args) {

		for(int i = 0; i <= 20; i++){
			System.out.print(i+" ");
		}
		System.out.println();

		int k = 6;
		while(k >= -6){
			System.out.print(k+" ");
			k-=2;
		}
		System.out.println();

		int l = 10;
		int sum = 0;
		do{
			if(l%2 == 1){
				sum+=l;
			}
			l++;
		} while(l<=20);
		System.out.print(sum);
	}
}