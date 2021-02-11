package saeum_selfstudy_algo;

// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다
// 한 줄 배열을 받고나서 학생/점수 나눠서 점수 배열을 또 받았음 ! (나는  이렇게 배열을 나눌 생각을 못함)

import java.io.*;
import java.util.*;

public class 백준_4344_평균은넘겠지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		int[] arr;
		int TC = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		
		for (int i = 0; i < TC; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적입력하기 
			int N = Integer.parseInt(st.nextToken()); // 학생수
			arr = new int[N];
			double sum = 0; // 누적합변수

			for (int j = 0; j < N; j++) {
				int value = Integer.parseInt(st.nextToken());
				arr[j] = value;
				sum += value;

			}
			
			double mean = (sum / N);
			double count = 0;// 평균 넘는 학생수

			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}
	}
}
