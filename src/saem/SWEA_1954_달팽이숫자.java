package saem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1954_달팽이숫자 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int TC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= TC; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];

			int row = 0; // 행
			int col = 0; // 열
			int size = N - 1; // 이동할 크기
			int num = 1; // 저장할 숫자

			while (size > 0) {
				for (int i = 0; i < size; i++) { // 우
					map[row][col] = num++;
					col++;// 오른 쪽 으로 옮기니까
				}

				for (int i = 0; i < size; i++) { // 하
					map[row][col] = num++;
					row++; // 아래로 내려가니가
				}

				for (int i = 0; i < size; i++) {// 좌
					map[row][col] = num++;
					col--;
				}

				for (int i = 0; i < size; i++) { // 상
					map[row][col] = num++;
					row--;
				}

				size -= 2; // size = size-2
				row++;
				col++;
			}

			if (N % 2 != 0) { // N이 홀수라면
				map[row][col] = num;
			}
			sb.append("#").append(t).append("\n");
			for (int i = 0; i < map.length; i++) { //문제에서 map 출력하라고 했음 ! 
				for (int j = 0; j < map.length; j++) {
					sb.append(map[i][j]).append(" ");
				}
			}
		}
	}
}
