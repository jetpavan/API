package programs;

public class PrimeNumber {

	public static void main(String[] P) {
		int num = 9;
		int m = num / 2;
		int flag = 0;

		if (num == 0 || num == 1) {
			System.out.println(num + " is not Prime");
		}

		else {
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not Prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is Prime");
			}
		}
	}
}
