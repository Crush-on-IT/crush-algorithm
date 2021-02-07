package bj.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1861_정사각형의방 {
	static int[][] dxdy= {{-1,0},{1,0},{0,-1},{0,1}};
	static int[][] map,memo;
	static boolean[][] visited;
	
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int answer1 = 0 ,answer2=0;
			
			N = Integer.parseInt(br.readLine());
			
			map = new int[N][N];
			memo = new int[N][N];
			visited = new boolean[N][N];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(visited[i][j])	continue;
					memo[i][j] = trip(i,j);
					
					if(memo[i][j] > answer2) {
						answer1 = map[i][j];
						answer2 = memo[i][j];
					}
					else if(memo[i][j] == answer2 && map[i][j] < answer1) {
						answer1 = map[i][j];
						answer2 = memo[i][j];
					}
				}
			}
			
			System.out.println("#"+t+" "+answer1+" "+answer2);
		}
		
	}
	
	private static int trip(int i, int j) {
		
		int cur = map[i][j];
		for (int j2 = 0; j2 < dxdy.length; j2++) {
			
			int nX=i+dxdy[j2][0];
			int nY = j + dxdy[j2][1];
			
			if(nX<0 || nY<0 || nX>=N || nY>=N)	continue;
			
			if(map[nX][nY] == cur+1) {
				
				if(visited[nX][nY])
					return memo[nX][nY]+1;
				
				int tmp = trip(nX,nY)+1;
				visited[i][j] = true;
				memo[i][j] = tmp;
				return tmp;
			}
			
		}
		visited[i][j] = true;
		memo[i][j] = 1;
		
		return 1;
	}

}
