package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1289_원재의메모리복구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int answer = 0;
			
			char[] input = br.readLine().toCharArray();
			
			int bit = 0;
			
			for (int i = 0; i < input.length; i++) {
				int cur = input[i]-'1';
				
				if(cur==bit)	continue;
				
				bit = cur;
				++answer;
				
			}
			
			System.out.println("#"+t+" "+answer);
		}
		
	}

}
