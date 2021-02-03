package saem;
import java.util.Scanner;

public class Solution_SWEA_2001_파리퇴치 {

	// 테케
	// N 입력 -> 배열
	// N에 숫자 넣기
	// M입력 -> m*m중 선택 -> 다 더하기
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int testcase = 1; testcase <= TC; testcase++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			int big_square[][] = new int[N][N];

			for (int i = 0; i < N; i++) { // *왜 x=1부터 하면 답이 안 나오는지 
				for (int j = 0; j < N; j++) {
					big_square[i][j] = sc.nextInt();// 숫자 집어넣기
				}
			}

			int max = 0;
			// int small_square[][] = new int[M][M]; 잘못한 부분 : M인 배열이랑 N인 배열을 따로 만들려고 했던 것
			for (int row = 0; row < N - M + 1; row++) { // 큰 배열 안에서 만들어 질 수 있는 작은 사각형
				for (int col = 0; col < N - M + 1; col++) { // 만들어 질 수 있는 작은 사각형

					// 작은 사각형 안에 들어가는 값들의 합
					int sum = 0;
					for (int x = 0; x < M; x++) { 
						for (int y = 0; y < M; y++) {
							sum += big_square[row + x][col + y];
						}
					}
					if (max < sum) {
						max = sum;
					}
				}
			}

			System.out.printf("#%d %d", testcase, max);
			System.out.println("");
		}
	}
}
