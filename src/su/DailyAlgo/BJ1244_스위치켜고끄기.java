package bj.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1244_스위치켜고끄기 {
	static int[] arr;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int M =Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int sex = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			switch(sex) {
			case 1:
				changeByMan(idx);
				break;
			case 2:
				changeByWoman(idx);
				break;
			}
		}
		int cnt=1;
		for (int i = 1; i <= N; i++,cnt++) {
			System.out.print(arr[i]+" ");
			if(cnt%20==0)
				System.out.println();
		}
	}
	private static void changeByWoman(int idx) {
		arr[idx] = arr[idx]==1?0:1;
		int tmp = 1;
		while(idx-tmp>0 && idx+tmp<=N) {
			if(arr[idx-tmp]!=arr[idx+tmp])	break;
			arr[idx-tmp] = arr[idx-tmp]==1?0:1;
			arr[idx+tmp] = arr[idx+tmp]==1?0:1;
			tmp++;
		}
	}
	private static void changeByMan(int idx) {
		int input= idx;
		while(idx<=N) {
			arr[idx] = arr[idx]==1?0:1;
			idx+=input;
		}
	}

}
