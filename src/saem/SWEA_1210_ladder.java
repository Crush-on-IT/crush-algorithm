package saem;
import java.util.Scanner;

public class SWEA_1210_ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testcase = 1; testcase <= 10; testcase++) {

			int r = 99;
			int c = -1;
			int TC = sc.nextInt(); // 테케 번호 버림
			int[][] m = new int[100][102]; // 인덱스가 넘어가는 것을 방지하기 위해서 좌우로 1열씩 여유칸을 둔다
			for (int i = 0; i < 100; i++) { // 열0열 1~100
				for (int j = 1; j <= 100; j++) {
					m[i][j] = sc.nextInt();
				}
			}
			
			//int r = 99;
			//int c = -1;
			for (int j = 1; j <= 100; j++) { // 마지막 행에서만 검사해서 2위치를 찾는다
				if (m[99][j] == 2) {
					c = j;
				}
			}

			final int 상 = 1;
			final int 좌 = 2;
			final int 우 = 3;
			int dir = 상; // 방향, 최초의 방향은 위로

			while (r > 0) {
				if (dir != 우 && m[r][c - 1] == 1) { // 좌
					dir = 좌;// 좌측으로 가기
					c--;
				} else if (dir != 좌 && m[r][c + 1] == 1) { // 우
					dir = 우;// 우측으로 가기
					c++;
				} else { // 상
					dir = 상;
					r--;
				}
			}
			System.out.println("#" + testcase + " " + (c - 1));

		}

	}
}
