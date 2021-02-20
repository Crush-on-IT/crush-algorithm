import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA9229_한빈이와spotmart__재귀 {

	static int arr[],max,N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
				
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			max = -1;
			
			makePair(0,0,0);
		
			System.out.println("#"+t+" "+max);
		}
		
	}

	private static void makePair(int start, int cnt, int sum) {
		
		if(cnt==2) {
			if(sum<=M && max<sum)	max=sum;
			return;
		}
		
		for (int i = start; i < N; i++) {
			makePair(i+1,cnt+1,sum+arr[i]);
		}
		
	}

}
