package saem;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1218_괄호짝짓기 {
	
	
//	peek() : Stack 최상단에 있는 top data 반환(Stack에서 꺼내진 않음)
//	pop() : Stack에 있는 데이터 꺼내기
//	push() : Stack에 데이터를 삽입
 

 
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);

		for (int testcase = 10; testcase <= 10; testcase++) {
			int tc = sc.nextInt();
			String a = sc.next();

			Stack<Character> stack = new Stack();  
			int r = 0;
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				if (c == ')' && stack.peek() == '(')
					stack.pop();
				else if (c == ']' && stack.peek() == '[')
					stack.pop();
				else if (c == '}' && stack.peek() == '{')
					stack.pop();
				else if (c == '>' && stack.peek() == '<')
					stack.pop();

				else {
					stack.push(c);

				}
			}
			if (stack.isEmpty()) //Stack 비어있는지 확인
				r = 1;
			else
				r = 0;
			System.out.println("#" + testcase + " " + r);
		}
	}
}
