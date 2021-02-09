package saem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2563_색종이_박새음 {

	public static int N;
	public static int ans = 0;
	public static int[][] map = new int[101][101];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					if (map[i][j] == 0) {
						map[i][j] = 1;
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
