package saeum_selfstudy_algo;



import java.util.*;

public class 백준_2941_크로아티아알파벳 {

	public static void main(String[] args) {

		// 묶음 문자열을 하나로 보고 배열만든다음에
		// 문자열 가지고 있으면 그냥 특이한 특수문자 하나로 바꿔서
		// length 길이 출력해버리는 것 ! --> 간단하고 좋다 !

		Scanner sc = new Scanner(System.in);
		String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String st = sc.nextLine();

		for (int i = 0; i < str.length; i++) {
			if (st.contains(str[i]))
				st = st.replace(str[i], "!");
		}

		System.out.println(st.length());
	}

}
