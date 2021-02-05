package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA3499_퍼펙트셔플 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			
			int N = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String[] input = new String[N];
			
			for (int i = 0; i < N; i++) {
				input[i] = st.nextToken();
			}
			
			System.out.print("#"+t);
			
			int half = N/2;
			int Rhalf = N%2==0?half:half+1;
			
			for (int i = 0; i < half; i++) {
				System.out.print(" "+input[i]);
				System.out.print(" "+input[Rhalf+i]);
			}
			if(N%2==1) {
				System.out.print(" "+input[half]);
			}
			System.out.println();
		}
	}

}
