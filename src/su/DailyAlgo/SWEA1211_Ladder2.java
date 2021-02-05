package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1211_Ladder2 {

	static int[][] dxdy = {{0,-1},{0,1},{1,0}};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int[][] map = new int[100][100];
		int T=0;
		
		for (int t = 1; t <= 10; t++) {
			T = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int startX = 0;
			int startY = 99;
			
			int answer=99;
			int min = Integer.MAX_VALUE;
			
			
			//map[0][startY]에서의 여정 시작!
			while(startY>=0) {
				
				if(map[startX][startY] == 0) {
					--startY;
					continue;
				}
				
				// 아래로 내려가면서 지나가는 길이 모두 더하기 !
				int cnt=0;
				
				int X = startX;
				int Y = startY;

				boolean[][] isVisited = new boolean[100][100];
				isVisited[X][Y] = true;
				
				while(X<99) {
					
					
					for (int i = 0; i < dxdy.length; i++) {
						int nX = X+dxdy[i][0];
						int nY = Y+dxdy[i][1];
						
						if(isAvail(nX, nY) && map[nX][nY]==1 &&!isVisited[nX][nY]) {
							
							isVisited[nX][nY] = true;
							X = nX;
							Y = nY;
							++cnt;
							
							break;
						}
					}
					
				}
				
				if(cnt<min) {
					min = cnt;
					answer = startY;
				}
				
				--startY;
			}
			
			System.out.println("#"+t+" "+answer);
		}
		
		
		
	}
	private static boolean isAvail(int nX, int nY) {
		if(nX<0 || nY<0 || nX>=100 || nY>=100)
			return false;
		return true;
	}
}
