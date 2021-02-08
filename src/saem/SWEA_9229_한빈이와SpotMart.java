package saem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_9229_한빈이와SpotMart {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder("");

		for (int t = 1; t <= TC; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()); // 과자의 개수
			int M = Integer.parseInt(st.nextToken()); // 무게의 합
			int[] arr = new int[N];
			int ans = -1;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {  
				arr[i] = Integer.parseInt(st.nextToken());

			}
			for (int x = N - 1; x > 0; x--) {
				for (int y = x - 1; y >= 0; y--) {
					if (arr[x] + arr[y] <= M && ans < arr[x] + arr[y]) {
						ans = arr[x] + arr[y];
						if (ans == M) {
							x = -1;
							y = -1;
						}
					}
				}
			}
			sb.append("#").append(t).append(" ").append(ans).append("\n");

		}
		System.out.println(sb);
	}

}
