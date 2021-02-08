package su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2805_농작물수확하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int answer = 0;
			
			int N = Integer.parseInt(br.readLine());
			int halfN = N/2;
			
			for (int i = 0; i < N; i++) {
				char[] input = br.readLine().toCharArray();
					
				int cur = halfN - Math.abs(halfN-i);
				for (int j = halfN-cur; j <= halfN+cur; j++) {
					answer+=input[j]-'0';
				}
				
			}
			
			
			
			System.out.println("#"+t+" "+answer);
		}
	}

}
