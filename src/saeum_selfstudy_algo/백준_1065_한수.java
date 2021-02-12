package saeum_selfstudy_algo;
 import java.util.*;

public class 백준_1065_한수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;
			for (int i = 100; i <= n; ++i) {
				result += checkNumber(i);
			}

			if (n == 1000)
				result--;
			System.out.println(result);
		}
	}

	private static int checkNumber(int number) {
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;

		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}
}
