package saem;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1208_Flatten {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1 ; t<=10; t++) {
			int dump = sc.nextInt();
			int arr[] = new int[100];
			
		for(int i =0; i<arr.length ; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr); //작은것부터 큰것까지 오름차순으로 보여줌
		
		for(int i =0; i<dump ; i++) {
			arr[0] ++;
			arr[99]--;
			Arrays.sort(arr);
		}
		System.out.printf("%d %d\n", t, arr[99]-arr[0]);
		}
	}
}