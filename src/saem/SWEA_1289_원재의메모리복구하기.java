package saem;
import java.util.Scanner;

public class SWEA_1289_원재의메모리복구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		int TC = sc.nextInt();
		for (int testCase = 1; testCase < TC; testCase++) {
			String val = sc.next(); // next로 받아야해 "0011"
			int cnt = 0; // 바꿔야되는 횟수를 카운팅할 변수

			// 이전인덱스의 값과 다르면 카운팅
			char pre = '0'; // 이전칸의 값
			for (int i = 0; i < val.length(); i++) {
				if (pre != val.charAt(i)) {
					cnt++;
					pre = val.charAt(i);
				}
			}
			System.out.println("#" + testCase + " " + cnt);
		}
	}
}
