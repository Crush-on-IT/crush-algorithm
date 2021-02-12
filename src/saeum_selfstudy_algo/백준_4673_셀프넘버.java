package saeum_selfstudy_algo;

 public class 백준_4673_셀프넘버 { //넥슨 

	public static void main(String[] args) {

		boolean[] check = new boolean[10000];

		for (int i = 1; i <= 10000; i++) {
			int num = i;
			String temp = String.valueOf(i);
			for (int t = 0; t < temp.length(); t++) {
				num += temp.charAt(t) - '0';
			}
			if (num > 10000)
				continue;
			check[num - 1] = true;
		}

		for (int i = 0; i < 10000; i++) {
			if (!check[i])
				System.out.println(i + 1);
		}

	}

}
