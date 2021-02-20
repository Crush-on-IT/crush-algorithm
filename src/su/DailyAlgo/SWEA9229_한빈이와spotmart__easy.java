import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA9229_한빈이와spotmart__easy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
				
			int arr[] = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = -1;
			//N개중 2개를 뽑는 경우 중 M이하 최대
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(i==j)	continue;
					int cur = arr[i]+arr[j];
					if(cur<=M && max<cur)	max=cur;
				}
			}
			System.out.println("#"+t+" "+max);
		}
		
	}

}
