package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1210_Ladder1 {

	static int[][] dxdy = {{-1,0},{0,-1},{0,1}};
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

			int X = 99;
			int Y = 0;
			
			for (int i = 0; i < 100; i++) {
				if(map[99][i]==2) {
					Y = i;
					break;
				}
			}
			map[X][Y] = -1;
			while(X>0) {
				
				for (int i = 0; i < dxdy.length; i++) {
					int nX = X+dxdy[i][0];
					int nY = Y+dxdy[i][1];
					
					if(isAvail(nX,nY)&&map[nX][nY]==1) {
						X = nX;
						Y = nY;
						map[nX][nY] = -1;
						continue;
					}
				}
				
			}
			
			System.out.println("#"+t+" "+Y);
		}
	}

	private static boolean isAvail(int nX, int nY) {
		if(nX<0 || nY<0 || nX>=100 || nY>=100)
			return false;
		return true;
	}

}
