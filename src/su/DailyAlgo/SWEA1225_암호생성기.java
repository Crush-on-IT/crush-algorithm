package src.su.DailyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA1225_암호생성기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue= new LinkedList<>();
		
		for (int t = 1; t <= 10; t++) {
			
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for (int i = 0; i < 8; i++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			
			int sub = 1;
			while(true) {
				int cur = queue.poll();
				cur = (cur-sub<=0)?0:cur-sub;
				queue.offer(cur);
				if(cur==0)	break;
				++sub;
				if(sub>5)	sub=1;
			}
			
			
			System.out.print("#"+t+" ");
			for (int i = 0; i < 8; i++) {
				System.out.print(queue.poll()+" ");
			}
			System.out.println();
		}
	}

}
