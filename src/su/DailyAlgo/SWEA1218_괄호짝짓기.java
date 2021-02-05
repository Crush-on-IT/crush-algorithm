package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA1218_괄호짝짓기 {

	static char[] open = {'{','(','[','<'}, close = {'}',')',']','>'};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int answer = 1;
			int N = Integer.parseInt(br.readLine());
			
			String input = br.readLine();
			
			Stack<Character> stack= new Stack<>();
			
			loop:
			for (int i = 0; i < N; i++) {
				char cur = input.charAt(i);
				
				for (int j = 0; j < open.length; j++) {
					if(cur == open[j]) {
						stack.add(cur);
						break;
					}
					if(cur == close[j]) {
						if(stack.pop() == open[j])	break;
						else {
							answer = 0;
							break loop;
						}
					}
				}
				
				
			}
			
			System.out.println("#"+t+" "+answer);
		}
	}

}
