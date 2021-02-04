package bj.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA1208_Flatten {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> bigPQ = new PriorityQueue<Integer>((Integer o1,Integer o2)->o2-o1);
		PriorityQueue<Integer> smallPQ = new PriorityQueue<Integer>((Integer o1, Integer o2)->o1-o2);
		
		for (int t =1; t <= 10; t++) {
			int answer = -1;
			bigPQ.clear();
			smallPQ.clear();
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for (int i = 0; i < 100; i++) {
				int cur = Integer.parseInt(st.nextToken());
				
				bigPQ.offer(cur);
				smallPQ.offer(cur);
				
			}
			for (int i = 0; i < N; i++) {
				int big = bigPQ.poll();
				int small = smallPQ.poll();
				
				if(big == small) {
					answer = 0;
					break;
				}
				bigPQ.offer(big-1);
				smallPQ.offer(small+1);
				
			}
			
			if(answer== -1) {
				answer = bigPQ.poll()-smallPQ.poll();
			}
			
			
			System.out.println("#"+t+" "+answer);
		}
	}

}
