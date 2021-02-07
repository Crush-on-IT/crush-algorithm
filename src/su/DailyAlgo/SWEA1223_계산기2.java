package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA1223_계산기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			
			int N = Integer.parseInt(br.readLine());
			
			String input = br.readLine();
			
			Stack<Integer> number = new Stack<>();
			Stack<Character> sign = new Stack<>();
			
			for (int i = 0; i < N; i++) {
				char ch = input.charAt(i);
				
				switch(ch) {
					case '+':
						while(!sign.isEmpty()) {
							number.add(cal(sign.pop(),number.pop(),number.pop()));
						}
						sign.add(ch);
						break;
					case '*':
						while(!sign.isEmpty()) {
							int cur = sign.peek();
							if(cur=='+')	break;
							number.add(cal(sign.pop(),number.pop(),number.pop()));
						}
						sign.add(ch);
						break;
					default:
						number.add(ch-'0');
						break;
				}
				
				
			}
			while(!sign.isEmpty()) {
				number.add(cal(sign.pop(),number.pop(),number.pop()));
			}
			
			System.out.println("#"+t+" "+number.pop());
		}
		
	}

	private static int cal(Character pop, int num1, int num2) {

		switch(pop) {
			case '+':
				return num1+num2;
			case '*':
				return num1*num2;
		}
		
		return 0;
	}

}
