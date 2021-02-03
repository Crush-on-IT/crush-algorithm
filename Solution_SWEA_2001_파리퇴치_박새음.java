import java.util.Scanner;

public class Solution_SWEA_2001_�ĸ���ġ {

	// ����
	// N �Է� -> �迭
	// N�� ���� �ֱ�
	// M�Է� -> m*m�� ���� -> �� ���ϱ�
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int testcase = 1; testcase <= TC; testcase++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			int big_square[][] = new int[N][N];

			for (int i = 0; i < N; i++) { // *�� x=1���� �ϸ� ���� �� �������� 
				for (int j = 0; j < N; j++) {
					big_square[i][j] = sc.nextInt();// ���� ����ֱ�
				}
			}

			int max = 0;
			// int small_square[][] = new int[M][M]; �߸��� �κ� : M�� �迭�̶� N�� �迭�� ���� ������� �ߴ� ��
			for (int row = 0; row < N - M + 1; row++) { // ū �迭 �ȿ��� ����� �� �� �ִ� ���� �簢��
				for (int col = 0; col < N - M + 1; col++) { // ����� �� �� �ִ� ���� �簢��

					// ���� �簢�� �ȿ� ���� ������ ��
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
