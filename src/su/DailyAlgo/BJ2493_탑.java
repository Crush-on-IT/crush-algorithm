package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ2493_탑 {

	static class Tower{
		int height;
		int index;
		public Tower(int height, int index) {
			super();
			this.height = height;
			this.index = index;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Stack<Tower> stack = new Stack<>();
		int[] answer = new int[N+1];
		stack.add(new Tower(Integer.parseInt(st.nextToken()),1));
		
		for (int i = 2; i <= N; i++) {
			int cur = Integer.parseInt(st.nextToken());
		
			while(!stack.isEmpty()) {
				if(stack.peek().height > cur) {
					answer[i] = stack.peek().index;
					break;
				}
				stack.pop();
			}
			
			stack.add(new Tower(cur,i));
			
		}
		
		for (int i = 1; i <= N; i++) {
			bw.write(answer[i]+" ");
		}
		bw.flush();
		bw.close();
	}

}
