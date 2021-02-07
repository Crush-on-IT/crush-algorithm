package saem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2805_농작물수확하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int TC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= TC; t++) {

			int sum = 0;
			int N = Integer.parseInt(br.readLine());
			int farm[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				char[] str = br.readLine().toCharArray();
				for (int j = 1; j < str.length; j++) {
					farm[i][j] = str[j];

				}

			}

			for (int d = 0; d < N / 2; d++) { // 중간값 0 1 2
				for (int e = N / 2 - d; e <= (N / 2 + d); e++) {
					sum += farm[d][e];
				}
			}

			// 하단 삼각형
			for (int d = N / 2; d >= 0; d--) {
				for (int e = N / 2 - d; e <= N / 2 + d; e++) {
					sum += farm[N - d - 1][e];
				}
			}

			sb.append("#").append(t).append("\n");
		}
	}
}
