package saeum_selfstudy_algo;

import java.util.*;

public class 백준_1157_단어공부 {

	public static void main(String[] args) {

		// 애초에 입력값을 싹다 대문자로 저장해버리면 됌

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();

		int[] arr = new int[26];
		int max = 0;
		char result = '?';

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++; // 각 자리에 알파벳 올려주기
			if (max < arr[str.charAt(i) - 'A']) {
				max = arr[str.charAt(i) - 'A'];
				result = str.charAt(i);

			} else if (max == arr[str.charAt(i) - 'A']) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
