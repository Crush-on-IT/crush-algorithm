package saeum_selfstudy_algo;



import java.io.*;

public class 백준_2675_문자열반복 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < TC; i++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			String S = str[1];

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < N; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}