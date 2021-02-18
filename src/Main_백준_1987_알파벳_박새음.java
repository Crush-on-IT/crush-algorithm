package saem;


import java.io.*;
import java.util.*;

public class Main_백준_1987_알파벳_박새음 {

	static int R;
	static int C;
	static int[][] arr;
	static boolean[] visit = new boolean[26]; // 알파벳 총 26개
	static int[] dx = { -1, 1, 0, 0 }; // 상,하,좌,우
	static int[] dy = { 0, 0, -1, 1 }; // 상,하,좌,우
	static int ans = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[R][C];

		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = str.charAt(j) - 'A'; // cf) string.charAt (i)- '0'은 정수로 변환
			}
		}
		dfs(0, 0, 0); //count 도 0으로 놓고 시작 
		System.out.println(ans);
	}

	public static void dfs(int x, int y, int count) {
		if (visit[arr[x][y]]) { // 0,0에 저장된 알파벳이 이미 방문했으면
			ans = Math.max(ans, count); // 정답 갱신
		} else {
			visit[arr[x][y]] = true;
			for (int i = 0; i < 4; i++) { //4방향 갈 수 있는데 
				int cx = x + dx[i];
				int cy = y + dy[i];

				if (cx >= 0 && cy >= 0 && cx < R && cy < C) {
					dfs(cx, cy, count + 1);
				}
			}
			visit[arr[x][y]] = false; //아니면 false 
		}
	}

}
